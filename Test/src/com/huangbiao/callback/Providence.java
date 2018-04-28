package com.huangbiao.callback;

/**
 * 提供者
 * Copyright © 2018 sf-express Info.  All rights reserved.
 * @Package: com.huangbiao.callback 
 * @author: 01375721   
 * @date: 2018年4月25日 上午10:00:50
 */
public class Providence implements DealInteface{
	
	  private Consumer ta;
	  
	  private MessageInfo info ;
	  
	  public Providence(MessageInfo info,Consumer ta){  
		 this.info = info;
		 this.ta = ta;
	  } 
	  
	  public void cleanCahe(boolean ack){
		  if(true == ack){
			 System.out.println("Providence:消费者已处理.内存清除操作-------"); 
			 System.out.println("Providence:进行DB操作");
			 System.out.println("ALL:整个通讯结束"); 
		  }
	  }
	  
	  // 执行轰炸世贸  
	  public void send(){  
		System.out.println("Providence:消息发客户端---》.:"+ta.toString());
	    ta.recive(this,info);
	  }

	@Override
	public MessageInfo getInfo() {
		// TODO Auto-generated method stub
		return info;
	}  
}
