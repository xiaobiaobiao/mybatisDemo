package com.huangbiao.callback;

public interface DealInteface {

	  //消息应答 
	  public void cleanCahe(boolean ack);
	  
	  public MessageInfo getInfo();
}
