package com.huangbiao.proxy;

public class ConsumeEntity {
	
	private String id;
	
	private String ip;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Consumer [id=" + id + ", ip=" + ip + "]";
	}

}
