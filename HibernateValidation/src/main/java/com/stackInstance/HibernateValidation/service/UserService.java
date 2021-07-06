package com.stackInstance.HibernateValidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackInstance.HibernateValidation.Repository.UserRepository;
import com.stackInstance.HibernateValidation.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user)
	{
		
		return userRepository.save(user);
		
	}

}
