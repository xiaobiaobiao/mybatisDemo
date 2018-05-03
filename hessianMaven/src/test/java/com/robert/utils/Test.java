package com.robert.utils;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.robert.bean.User;
import com.robert.dao.UserDao;

/**
 * 单元测试
 * @author 01375721
 *
 */
public class Test {

  //  static UserDaoImpl userDao;
    
    public UserDao userDao;
    
/*    @BeforeClass
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
    }*/

   @org.junit.Test
    public void springAdd(){
    	
    	 //初始化容器
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获得bean
        userDao=ctx.getBean(UserDao.class);
        User user1= new User();
        String id = UUID.randomUUID().toString().replace("-", "0");
    	user1.setName("你好啊");
    	user1.setUserKey(id);
    	int t = userDao.addUser(user1);
        //访问数据库
        List<User> usrs=userDao.getAllUser();
        for(User user: usrs){
        	System.out.println(user.toString());
        }
    }
    
}
