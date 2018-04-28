package com.huangbiao.proxy;

import java.util.Map;

public interface ProxyFunction  {
	
	void dealWork(Map<String,Object> data);
	
	void doAfter();
	
	void cleanCahe(boolean ack);
}
