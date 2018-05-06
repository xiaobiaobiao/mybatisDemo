package com.roberthuang.ssm.bean;

public class User {
	
    private Integer id;

    private String name;

    private String userkey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey == null ? null : userkey.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userkey=" + userkey + "]";
	}
    
    
}