package com.stackInstance.HibernateValidation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackInstance.HibernateValidation.model.User;
import com.stackInstance.HibernateValidation.service.UserService;

@RestController
@RequestMapping("/stackInstance")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> addUser( @Valid @RequestBody User user)
	{
		User createUser= userService.saveUser(user);
		return new ResponseEntity<User>(createUser, HttpStatus.CREATED);
	}

}
