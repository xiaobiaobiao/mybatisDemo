package com.robert.utils;

import java.util.UUID;

import org.junit.BeforeClass;
import com.robert.bean.User;
import com.robert.dao.UserDaoImpl;

/**
 * 单元测试
 * @author 01375721
 *
 */
public class Test {

    static UserDaoImpl userDao;
    
    @BeforeClass
    public static void beforeClass()
    {
    	userDao= new UserDaoImpl();
    }
    
    @org.junit.Test
    public void getSingleUser() {
        User usrs=userDao.getSingleUser(6);
        System.out.println(usrs==null?"不存在":usrs.toString());
    }
    
    @org.junit.Test
    public void addUser() {
        User user= new User();
        String id = UUID.randomUUID().toString().replace("-", "0");
    	user.setName("家里看书记得付款了");
    	user.setUserKey(id);
    	int t = userDao.addUser(user);
    	System.out.println("addUser:"+t);
    }

}
