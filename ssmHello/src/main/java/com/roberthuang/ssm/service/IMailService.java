package com.roberthuang.ssm.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

public interface IMailService {

	void sendHtmlMail(String to, String subject, String html)throws MessagingException,UnsupportedEncodingException ;
	 void sentEmails(String email, String subject, String text);
}
