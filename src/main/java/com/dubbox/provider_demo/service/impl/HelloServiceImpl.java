package com.dubbox.provider_demo.service.impl;

import org.springframework.stereotype.Service;

import com.dubbox.provider_demo.service.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello() {
		System.out.println(" say hello !!!");
	}

}
