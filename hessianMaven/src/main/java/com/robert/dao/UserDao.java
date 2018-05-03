package com.robert.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.robert.bean.User;

/**
 * 
 * 
 * *****************************************
 * 
 * @Desccription ：TODO
 *
 * @author  ：01375721
 *
 * @date :2018年5月3日下午2:35:44
 *
 * 
 * ******************************************
 */
public interface UserDao {

	public User getSingleUser(@Param("id") int id);
	
	public List<User> getAllUser();
	
	public int addUser(@Param("user") User user);
}

