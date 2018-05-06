package com.roberthuang.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberthuang.ssm.bean.User;
import com.roberthuang.ssm.dao.UserMapper;

/**
 * user 业务层
  @Description：TODO
 * **************************************************
 *
 * @author 黄标

 * @date  2018年5月5日上午1:28:46
 *  
 * **************************************************
 */
@Service("loginService")
public class LoginServiceImpl implements ILoginService{
	
   @Autowired  
    private UserMapper userMapper;  

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public int register(String userName, String userKey) {
		User user = new User();
		user.setName(userName);
		user.setUserkey(userKey);
		return userMapper.insertSelective(user);
	}

	public User getUserByName(String name) {
		
		return userMapper.selectByName(name);
	}

}
