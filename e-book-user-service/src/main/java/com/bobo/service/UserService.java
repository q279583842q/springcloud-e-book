package com.bobo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bobo.pojo.User;

@RequestMapping("/user")
public interface UserService {

	// 用户登录
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public User login(@RequestParam("userName") String userName
			, @RequestParam("password") String password);
}
