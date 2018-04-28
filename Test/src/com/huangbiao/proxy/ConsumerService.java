package com.huangbiao.proxy;

import com.huangbiao.callback.MessageInfo;

/**
 * 消费端
 * Copyright © 2018 sf-express Info.  All rights reserved.
 * @Package: com.huangbiao.callback 
 * @author: 01375721   
 * @date: 2018年4月25日 上午10:03:57
 */
public class ConsumerService {
	/**
	  * 消息处理
	 * @Description: TODO 
	 * @param bmw void
	 * @date 2018年4月25日上午10:04:07
	  */
     public void recive(ProxyFunction bmw,MessageInfo info){
    	//提供者提供消息
	    System.out.println("Consumer:接收到消息："+info.toString());
	    System.out.println("Consumer:通知providence消息处理成功");
	    //告诉提供者消息处理完毕。。。可以清除数据
	    bmw.cleanCahe(true);
	  }  
}
