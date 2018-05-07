package com.roberthuang.ssm.service;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailServiceImpl implements IMailService{

	private static final String HOST = "smtp.163.com";
    private static final Integer PORT = 25;
    private static final String USERNAME = "18664300934@163.com";
    private static final String PASSWORD = "625385919hhbb";
    private static final String EMAILFORM = "18664300934@163.com";
    
    
    private JavaMailSender mailSender;  
    
    public JavaMailSender getMailSender() {  
        return mailSender;  
    }  
  
    public void setMailSender(JavaMailSender mailSender) {  
        this.mailSender = mailSender;  
    }  
    /**
     * 发送邮件
     *
     * @param to 接受人
     * @param subject 主题
     * @param html 发送内容
     * @throws MessagingException 异常
     * @throws UnsupportedEncodingException 异常
     */
    public void sendHtmlMail(String to, String subject, String html)throws MessagingException,UnsupportedEncodingException {
        
    	 JavaMailSenderImpl sender = new JavaMailSenderImpl();
         sender.setHost(HOST);
         sender.setPort(PORT);
         sender.setUsername(USERNAME);
         sender.setPassword(PASSWORD);
         sender.setDefaultEncoding("Utf-8");
         Properties p = new Properties();
         p.setProperty("mail.smtp.timeout", "25000");
         p.setProperty("mail.smtp.auth", "false");
         sender.setJavaMailProperties(p);
    	MimeMessage mimeMessage = sender.createMimeMessage();
        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(EMAILFORM, "系统名称");
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);
        sender.send(mimeMessage);
    }
    
    /** 
     * 发送简单文本邮件（可含多个emails，按':'分割） 
     *  
     * @param emails 
     * @param subject 
     * @param text 
     */  
    public void sentEmails(String email, String subject, String text) {  
        // 获取JavaMailSender bean  
  
        // SimpleMailMessage只能用来发送text格式的邮件  
        SimpleMailMessage mail = new SimpleMailMessage();  
    
        mail.setTo(email);// 接受者  
        mail.setFrom("发送者邮箱");  
        mail.setSubject(subject);// 主题  
        mail.setText(text);// 邮件内容  
        mailSender.send(mail);  
         
        }  
}
