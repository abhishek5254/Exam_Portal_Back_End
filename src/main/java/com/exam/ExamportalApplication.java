package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {

	@Autowired
	private UserService userservice;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user=new User();
//
//		user.setUsername("Abhi@123");
//		user.setFirstName("Abhishek");
//		user.setLastName("Upadhyay");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abhi@123"));
//		user.setEmail("abhishekup7752@gmail.com");
//		user.setProfile("default.png");
//		user.setPhone("7380803382");
//
//		Role role1=new Role();
//
//		role1.setRoleId(3L);
//		role1.setRoleName("Admin");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole  userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1 = this.userservice.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());


	}
}
