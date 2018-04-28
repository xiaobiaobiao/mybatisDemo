package com.huangbiao.proxy;

import java.util.Map;

public abstract class MiddleInteface implements ProxyFunction{
	
	public abstract void dealWork(Map<String,Object> data);

	//消息应答 
    public  void cleanCahe(boolean ack){
    	
    }
    
	public void doAfter(){
		System.out.println("MiddleInteface: doAfter");
	};
}
