package com.qiao.redis;

import com.alibaba.fastjson.JSON;

/**
 * @author huangqf
 */
public class Util {
	public static  String beanToJson(Object o){
		return JSON.toJSONString(o);
	}
	//parse an object from 
	public static <T> T jsonToBean(String json,Class<T> cls){
		return JSON.parseObject(json, cls);
	} 
}
