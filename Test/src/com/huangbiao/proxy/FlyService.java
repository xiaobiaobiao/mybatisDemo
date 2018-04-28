package com.huangbiao.proxy;

import java.util.Map;

public class FlyService extends MiddleInteface{

	
    @Override
    public void dealWork(Map<String,Object> data) {
        System.out.println(data.toString());
    }
}
