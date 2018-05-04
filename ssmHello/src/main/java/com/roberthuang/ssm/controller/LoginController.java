package com.roberthuang.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roberthuang.ssm.bean.User;
import com.roberthuang.ssm.service.ILoginService;
import com.roberthuang.ssm.service.IRedisService;

@Controller
@RequestMapping(value = "/")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@Autowired
	private IRedisService redisService;
	
	private Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", produces = "text/html;charset=UTF-8")
	@ResponseBody
	private String getOtherList(@RequestParam String userName,@RequestParam String pwd) {
		
		log.info("userName:{},pwd:{}",userName,pwd);
		User user = loginService.getUserById(6);
		return user == null ? "用户不存在" : user.toString();
	}
	
	@RequestMapping(value = "/login.htm", produces = "text/html;charset=UTF-8")
	private String login() {
		return "login";
	}
	
	@RequestMapping(value = "/register.htm", produces = "text/html;charset=UTF-8")
	private String registerHtml() {
		return "register";
	}
	
	@RequestMapping(value = "/register", produces = "text/html;charset=UTF-8")
	private String register(@RequestParam String userName,@RequestParam String password) {
		return "ok";
	}
}
