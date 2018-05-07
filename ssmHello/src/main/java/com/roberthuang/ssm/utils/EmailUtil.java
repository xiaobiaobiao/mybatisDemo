package com.roberthuang.ssm.utils;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class EmailUtil {
	 public static void main(String args[]) {
	        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
	        
	        try {
	        	  senderImpl.setHost("smtp.qq.com");
	  	        senderImpl.setProtocol("smtp");
	  	        senderImpl.setUsername("1475068541@qq.com");
	  	        senderImpl.setPassword("625385919hhbb");
	  	        senderImpl.setPort(587);
	  	        senderImpl.setDefaultEncoding("UTF-8");

	  	        // 建立邮件消息
	  	        SimpleMailMessage mailMessage = new SimpleMailMessage();
	  	        // 设置收件人，寄件人 用数组发送多个邮件
	  	        String[] array = new String[] {"18664300934@163.com"};
	  	        mailMessage.setTo(array);
	  	        mailMessage.setFrom("1475068541@qq.com");

	  	        mailMessage.setSubject("测试简单文本邮件发送！");
	  	        mailMessage.setText("测试我的简单邮件发送机制！！");

	  	        Properties prop = new Properties();
	  	        prop.put("mail.smtp.auth", "true");
	  	        prop.put("mail.smtp.timeout", "25000");
	  	        senderImpl.setJavaMailProperties(prop);
	  	        // 发送邮件
	  	        senderImpl.send(mailMessage);

	  	        System.out.println(" 邮件发送成功.. ");
			} catch (Exception e) {
				e.printStackTrace();
			}
	        // 设定mail server
	      
	    }
}
