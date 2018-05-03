package com.roberthuang.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberthuang.ssm.bean.User;
import com.roberthuang.ssm.dao.UserMapper;

@Service
public class LoginServiceImpl implements ILoginservice{
	
   @Autowired  
    private UserMapper userMapper;  

	@Override
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
