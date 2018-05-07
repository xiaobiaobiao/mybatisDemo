package com.roberthuang.ssm.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;
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
	
	
	private String VIEW_FAIL = "fail"; //失败页面
	
	private String VIEW_LOGIN = "login"; //登录页面 
	
	private String VIEW_LOGIN_SUCCESS = "successLogin"; //登录成功页面(后续个人中心页面)
	
	private String VIEW_REGISTER = "register"; //注册页面
	
	/**
	 * 说明: 为了统一规范,需要跳转页面的路径统一带.htm
	 */
	
	@Autowired
	private ILoginService loginService;

	
	private Logger log = LoggerFactory.getLogger(LoginController.class);
	


	@RequestMapping(value = "/login", produces = "applicaiont/json;charset=UTF-8")
	@ResponseBody
	private String getOtherList(@Valid User user,BindingResult result,Model model) {
		
		JSONObject json = new JSONObject();
		if(result.hasErrors()){
			log.info("参数有误:{}",result.getFieldError().getDefaultMessage());
			json.put("code", result.getFieldError().getField()+"-error");
			json.put("msg", result.getFieldError().getDefaultMessage());
			return json.toJSONString();
		}
		
		try {
			log.info("user:{}",user.toString());
			User datauser = loginService.getUserByName(user.getName());
			
			json.put("code", "SUCCESS");
			if(null == datauser){
				json.put("msg", "用户不存在");
				json.put("code", "name-error");
				return json.toJSONString();
			}
			if(!user.getUserkey().equals(datauser.getUserkey())){
				json.put("msg", "密码错误");
				json.put("code", "userkey-error");
				return json.toJSONString();
			}
			json.put("user", user);
			model.addAttribute("userName",user.getName());
		} catch (Exception e) {
			log.error("系统异常",e);
		}
		return json.toJSONString();
	
	
	}
	
	@RequestMapping(value = "/login.htm", produces = "text/html;charset=UTF-8")
	private String login() {
		return VIEW_LOGIN;
	}
	
	@RequestMapping(value = "/success.htm", produces = "text/html;charset=UTF-8")
	private String success(@RequestParam String userName,Model model) {
		if(!StringUtils.isNotEmpty(userName) || userName.equals("null") || userName.equals("''")){
			return VIEW_FAIL;
		}
		model.addAttribute("userName", userName);
		return VIEW_LOGIN_SUCCESS;
	}
	
	
	@RequestMapping(value = "/fail.htm", produces = "text/html;charset=UTF-8")
	private String fail() {
		return VIEW_FAIL;
	}
	
	
	@RequestMapping(value = "/register.htm", produces = "text/html;charset=UTF-8")
	private String registerHtml() {
		return VIEW_REGISTER;
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
			 return VIEW_LOGIN_SUCCESS;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return null;
	}
	
	@RequestMapping(value = "/boostrap/test.htm", produces = "text/html;charset=UTF-8")
	private String test() {
			return "boostrap/test";
	}
}
