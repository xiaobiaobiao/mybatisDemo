package com.robert.dao;

import org.apache.ibatis.annotations.Param;

import com.robert.bean.User;

public interface UserDao {

	public User getSingleUser(@Param("id") int id);
	
	public int addUser(@Param("user") User user);
}
