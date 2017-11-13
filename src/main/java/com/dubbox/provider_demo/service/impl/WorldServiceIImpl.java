package com.dubbox.provider_demo.service.impl;

import org.springframework.stereotype.Service;

import com.dubbox.provider_demo.service.WorldService;

@Service("worldService")
public class WorldServiceIImpl implements WorldService {

	@Override
	public void world() {
		System.out.println("1111111");
	}

}
