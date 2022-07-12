package com.exam.services.impl;

import com.exam.helper.UserFoundException;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    // Creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local=this.userRepository.findByUsername(user.getUsername());

        if(local!=null)
        {
            System.out.println("user is already exists");
            throw new UserFoundException();
        }
        else
        {
            // create user
            for(UserRole ur:userRoles)
            {
                roleRepository.save(ur.getRole());

            }
            user.getUserRoles().addAll(userRoles);
            local =this.userRepository.save(user);
        }

        return local;
    }

    // getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }

//    @Override
//    public User updateUser(String username) {
//
//         User u = this.userRepository.save(username);
//
//        return u;
//    }
}