package com.conley.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.conley.dao.IUserDao;
import com.conley.pojo.User;
import com.conley.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}

