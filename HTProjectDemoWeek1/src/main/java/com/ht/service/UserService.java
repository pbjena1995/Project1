package com.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.entity.User;
import com.ht.repository.UserRepo;

@Service
public class UserService {

	
	@Autowired
	UserRepo userRepo;
	
	public void saveUser(User user) {
		userRepo.save(user); 
	}

	public List<User> getAllUser() {
		return userRepo.findAll();
	}
}
