package com.ht.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ht.entity.User;
import com.ht.repository.UserRepo;
import com.ht.service.UserService;

@RestController
@RequestMapping("/UserController")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		try {
			userService.saveUser(user);
			return ResponseEntity.of(Optional.of(user));
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@GetMapping("/get/alluser")
	public ResponseEntity<List<User>> getAllUser(){
		try {
			List<User> user=userService.getAllUser();
			return ResponseEntity.of(Optional.of(user));
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
