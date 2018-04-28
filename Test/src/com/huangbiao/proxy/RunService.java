package com.huangbiao.proxy;

import java.util.Map;

import com.huangbiao.callback.MessageInfo;


public class RunService extends MiddleInteface {


	private MessageInfo info;

	private ConsumerService ta;

	public RunService(MessageInfo info, ConsumerService ta) {
		this.info = info;
		this.ta = ta;
	}

	public void addFunction() {
		System.out.println("增加操作");
	}

	@Override
	public void dealWork(Map<String,Object> data) {
		System.out.println(data.toString());
		ta.recive(this, info);
	}

	@Override
	public void doAfter() {
		System.out.println("业务拓展操作..............");
	};

	// 消息应答
	@Override
	public void cleanCahe(boolean ack) {
		if (true == ack) {
			System.out.println("Providence:消费者已处理.内存清除操作-------");
			System.out.println("Providence:进行DB操作");
			System.out.println("ALL:整个通讯结束");
		}
	}
}
