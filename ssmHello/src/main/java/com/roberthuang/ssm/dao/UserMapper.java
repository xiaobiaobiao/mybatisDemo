package com.roberthuang.ssm.dao;

import com.roberthuang.ssm.bean.User;

/**
 * user 持久层
  @Description：TODO
 * **************************************************
 *
 * @author 黄标

 * @date  2018年5月5日上午1:28:29
 *  
 * **************************************************
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByName(String name);
}