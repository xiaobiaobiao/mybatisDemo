package com.roberthuang.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roberthuang.ssm.bean.User;
import com.roberthuang.ssm.service.ILoginservice;

@Controller
@RequestMapping(value = "/")
public class LoginController {

	@Autowired
	private ILoginservice loginService;

	@RequestMapping(value = "/login", produces = "text/html;charset=UTF-8")
	@ResponseBody
	private String getOtherList(@RequestParam int id) {
		User user = loginService.getUserById(id);
		return user == null ? "用户不存在" : user.toString();
	}
	
	@RequestMapping(value = "/login.htm", produces = "text/html;charset=UTF-8")
	private String getOtherList() {
		
		return "login";
	}
}
