//package com.roberhuang.ssm.ssmHello;
//
//import java.io.UnsupportedEncodingException;
//
//import javax.mail.MessagingException;
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
//import com.roberthuang.ssm.service.IMailService;  
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
//	   @Autowired
//	   	private IMailService mailService;
//	  
//	    @Test  
//	    public void test() {  
//	           User list=loginService.getUserById(6);  
//	           logger.info(list.toString());  
//	    } 
//	    
//	    @Test  
//	    public void test01() {  
//	    	try {
//				mailService.sendHtmlMail("1475068541@qq.com", "测试", "测试测试");
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			} catch (MessagingException e) {
//				e.printStackTrace();
//			} 
//	    }  
//}
