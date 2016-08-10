package com.dimit.service;

import java.util.ServiceLoader;

import org.junit.Test;

public class ServiceLoadTest {
	/**
	 * ServiceLoader测试
	 */
	@Test
	public void loadServiceTest() {
		ServiceLoader<IService> services = ServiceLoader.load(IService.class);
		for (IService service : services) {
			System.err.println(service.sayHello());
		}
	}
}
