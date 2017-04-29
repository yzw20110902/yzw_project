package cn.itcast.test.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.test.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("service say hi...");
	}
}
