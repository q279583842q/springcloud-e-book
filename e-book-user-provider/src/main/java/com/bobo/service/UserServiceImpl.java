package com.bobo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.mapper.UserMapper;
import com.bobo.pojo.User;
import com.bobo.pojo.UserExample;

@Service
public class UserServiceImpl {

	@Autowired
	private UserMapper userMapper;
	
	public User login(String userName,String password){
		UserExample example = new UserExample();
		example.createCriteria()
				.andUserNameEqualTo(userName)
				.andPasswordEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		if(list == null || list.size() != 1){
			return null;
		}else{
			return list.get(0);
		}
	}
}
