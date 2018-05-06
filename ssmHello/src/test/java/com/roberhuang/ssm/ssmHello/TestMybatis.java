//package com.roberhuang.ssm.ssmHello;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;  
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.roberthuang.ssm.bean.User;
//import com.roberthuang.ssm.service.ILoginService;  
//
//@RunWith(SpringJUnit4ClassRunner.class)   
//@ContextConfiguration(locations = {"classpath:application-spring.xml"})  
//public class TestMybatis {
//	
//		Logger logger = LoggerFactory.getLogger(TestMybatis.class);
//	
//	   @Autowired  
//	    private ILoginService loginService;  
//	  
//	    @Test  
//	    public void test() {  
//	           User list=loginService.getUserById(6);  
//	           logger.info(list.toString());  
//	    }  
//}
