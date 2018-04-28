package com.huangbiao.callback;

import java.util.Date;

public class MessageInfo {
	
	private String messId;
	
	private String body;
	
	private Date date;

	public String getMessId() {
		return messId;
	}

	public void setMessId(String messId) {
		this.messId = messId;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MessageInfo [messId=" + messId + ", body=" + body + ", date="
				+ date + "]";
	}

}
