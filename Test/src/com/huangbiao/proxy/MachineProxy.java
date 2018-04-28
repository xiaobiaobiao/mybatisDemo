package com.huangbiao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * 
 * *****************************************
 * 
 * @Desccription ：代理类
 * 
 * @author ：01375721
 * 
 * @date :2018年4月26日上午9:47:40
 * 
 * 
 * ******************************************
 */
public class MachineProxy<T> implements InvocationHandler {

	/**
	 * 代理的对象
	 */
	private T t;

	private ClassLoader classLoader;

	/**
	 * 获取代理对象
	 * 
	 * @Description: TODO
	 * @param t
	 * @return T
	 * @date 2018年4月25日下午5:41:53
	 */
	@SuppressWarnings("unchecked")
	public T getProxy(T t) {
		this.t = t;
		classLoader = t.getClass().getClassLoader();
		T tt = (T) Proxy.newProxyInstance(classLoader,new Class[] { ProxyFunction.class }, this);
		return tt;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		// 记录日志

		Object data1 = args[0];
		System.out.println("invoke coming:" + t.getClass().getName() + "."+ method.getName());
		if (data1 == null)
			throw new Exception("参数不能为空 代码:ERR03");
		if (!(data1 instanceof HashMap)) {
			throw new Exception("参数类型错误 代码:ERR02");
		}
		System.out.println("data=" + data1.toString());
		Map<String, Object> map = (Map<String, Object>) data1;
		Iterator<?> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Entry) iter.next();
			System.out.println();
			if (null == entry.getValue() || "".equals(entry.getValue())) {
				throw new Exception();
			}
		}
		Object result = method.invoke(t, args);
		System.out.println(data1);
		return result;
	}

}
