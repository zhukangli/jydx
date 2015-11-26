package com.conley.service.impl;


import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conley.dao.IUserDao;
import com.conley.pojo.User;
import com.conley.service.IUserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	

	public List<User> findAll() {
		return this.userDao.findAll();
	}

}

