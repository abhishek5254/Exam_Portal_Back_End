package com.exam.services;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    // deleting user by id
    public void deleteUser(Long userId);

    // updating user by Username
  //  public User updateUser(String username);
}
