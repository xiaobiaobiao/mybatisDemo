package com.roberthuang.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.roberthuang.ssm.bean.User;
import com.roberthuang.ssm.service.ILoginService;

/**
 * user 控制器
  @Description：TODO
 * **************************************************
 *
 * @author 黄标

 * @date  2018年5月5日上午1:29:01
 *  
 * **************************************************
 */
@Controller
@RequestMapping(value = "/")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	private Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", produces = "text/html;charset=UTF-8")
	@ResponseBody
	private String getOtherList(@RequestParam String userName,@RequestParam String pwd) {
		
		log.info("userName:{},pwd:{}",userName,pwd);
		User user = loginService.getUserByName(userName);
		return user == null ? "用户不存在" : user.toString();
	}
	
	@RequestMapping(value = "/login.htm", produces = "text/html;charset=UTF-8")
	private String login() {
		return "login";
	}
	
	@RequestMapping(value = "/success.htm", produces = "text/html;charset=UTF-8")
	private String success(@RequestParam String userName,Model model) {
		if(!StringUtils.isNotEmpty(userName) || userName.equals("null") || userName.equals("''")){
			return "success";
		}
		model.addAttribute("userName", userName);
		return "success";
	}
	
	
	@RequestMapping(value = "/fail.htm", produces = "text/html;charset=UTF-8")
	private String fail() {
		return "fail";
	}
	
	
	@RequestMapping(value = "/register.htm", produces = "text/html;charset=UTF-8")
	private String registerHtml() {
		return "register";
	}
	
	@RequestMapping(value = "/register", produces = "text/html;charset=UTF-8")
	@ResponseBody
	private String register(@RequestParam String userName,@RequestParam String password,Model model) {
		try {
			
		log.info("---userName={},password={} ---",userName,password);
		User user = loginService.getUserByName(userName);
		
		if( null != user){
			log.info("---userName={}已经存在",userName);
			model.addAttribute("msg", userName+"->已经存在");
			return "注册失败,用户已经存在";
		}
		model.addAttribute("userName", userName);
		int i = loginService.register(userName, password);
		if(i > 0 ){
			log.info("---userName={}注册成功",userName);
			 return "success";
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return null;
	}
}
