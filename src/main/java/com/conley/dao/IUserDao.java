package com.conley.dao;

import com.conley.pojo.User;

public interface IUserDao {

	public User selectByPrimaryKey(int userId);

}
