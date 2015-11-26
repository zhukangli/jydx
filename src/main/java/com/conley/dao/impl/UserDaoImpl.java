package com.conley.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.conley.dao.IUserDao;
import com.conley.pojo.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

	public List<User> findAll() {
		return getSqlSession().selectList(getClassName()+".findAll");
	} 

}
