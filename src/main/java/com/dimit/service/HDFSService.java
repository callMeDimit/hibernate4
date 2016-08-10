package com.dimit.service;
/**
 * @author dimit
 */
public class HDFSService implements IService {

	@Override
	public String sayHello() {
		return "Hello HDFS!!";
	}

	@Override
	public String getScheme() {
		return "hdfs";
	}
}
