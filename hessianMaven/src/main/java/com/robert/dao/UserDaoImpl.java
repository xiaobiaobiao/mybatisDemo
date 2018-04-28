package com.robert.dao;

import org.apache.ibatis.session.SqlSession;

import com.robert.bean.User;
import com.robert.utils.MyBatisUtil;

public class UserDaoImpl implements UserDao {

	public User getSingleUser(int id) {
		// 获得会话对象
		SqlSession session = MyBatisUtil.getSession();
		try {
			// 通过MyBatis实现接口BookTypeDAO，返回实例
			UserDao userDao = session.getMapper(UserDao.class);
			return userDao.getSingleUser(id);
		} finally {
			session.close();
		}
	}

	public int addUser(User user) {
		SqlSession session = MyBatisUtil.getSession();
		try {
			UserDao userDao = session.getMapper(UserDao.class);
			session.getConnection();
			int result = userDao.addUser(user);
			session.commit();
			return result;
		} finally {
			session.close();
		}
	}


}
