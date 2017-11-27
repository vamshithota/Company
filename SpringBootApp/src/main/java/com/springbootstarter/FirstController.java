package com.springbootstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/sayhello")
	public String sayHello() {
		return "Hello!";
	}
	
}
