package com.bobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.pojo.User;
import com.bobo.service.UserService;
import com.bobo.service.UserServiceImpl;

@RestController
public class UserController implements UserService{
	
	@Autowired
	private UserServiceImpl service;

	@Override
	public User login(String userName, String password) {
		User user = service.login(userName, password);
		return user;
	}

}
