package com.roberthuang.ssm.service;

import com.roberthuang.ssm.bean.User;

public interface ILoginService {

	  /**
	   * 通过ID查找
	   * @param id
	   * @return
	   */
	  public User getUserById(int id);
	  
	  /**
	   * 通过用户名查找
	   * @param id
	   * @return
	   */
	  public User getUserByName(String name);
	  
	  /**
	   * 注册
	   * @param userName
	   * @param userKey
	   * @return
	   */
	  public int register(String userName,String userKey);
}
