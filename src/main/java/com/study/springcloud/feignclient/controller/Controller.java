package com.study.springcloud.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springcloud.feignclient.client.SayHelloClient;




@RestController
public class Controller {
    @Autowired
    private SayHelloClient sayHelloClient;
	@RequestMapping("/say")
    public String say() {
		
		return sayHelloClient.say();
	}
	 
}
