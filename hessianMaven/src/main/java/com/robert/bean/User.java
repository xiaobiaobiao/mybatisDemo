package com.robert.bean;

public class User {
	

	private int id;
	
	private String userKey;
	
	private String name;


	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userKey=" + userKey + ", name=" + name + "]";
	}
	
	
}
