package com.huangbiao.test;



import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.huangbiao.callback.MessageInfo;
import com.huangbiao.proxy.ConsumerService;
import com.huangbiao.proxy.MachineProxy;
import com.huangbiao.proxy.ProxyFunction;
import com.huangbiao.proxy.RunService;


/**
 * 
 * Copyright © 2018 sf-express Info.  All rights reserved.
 * @Package: com.huangbiao.test 
 * @author: 01375721   
 * @date: 2018年4月23日 下午4:42:32
 */
public class Hello {

	
	public static void main(String[] args) {

		MessageInfo mess = new MessageInfo();
		mess.setMessId("S:"+UUID.randomUUID().toString());
		mess.setBody("{\"name\":\"111\",\"age\":3}");
		mess.setDate(new Date());
		
		ConsumerService con = new ConsumerService();
		ProxyFunction subject = (ProxyFunction) new MachineProxy<RunService>().getProxy(new RunService(mess, con));
		Map<String,Object> data= new HashMap<String,Object>();
		data.put("custId", 1234);
		data.put("name","黄标");
		data.put("pwd","12345678z");
		try {
			subject.dealWork(data);
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		String person= "hello,pwd,name";
		List<String> list = Arrays.asList(person.split(","));
		for(String ss:list){
			System.out.println(ss);
		}
	}


}
