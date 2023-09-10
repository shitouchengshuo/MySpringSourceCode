package com.qiqi.controller;

import com.qiqi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ZhaoQiqi
 * @create 2023/7/26 13:46
 */
@RestController
public class TestController {

	@Autowired
	private HelloService helloService;

	public TestController() {
		System.out.println("TestController");
	}

	@GetMapping("/hello")
	public String sayHello(){
		String mvc = helloService.say("MVC");
		return mvc;
	}
}
