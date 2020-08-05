 package com.study.springcloud.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(name="configclient")
public interface SayHelloClient {
  
	@RequestMapping("/say")
    public String say();
}
