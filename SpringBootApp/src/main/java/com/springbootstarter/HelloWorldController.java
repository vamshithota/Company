package com.springbootstarter;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	MessageSource messagesource;
	
    @GetMapping("/helloworld")
	public String HelloWorld() {
		return "Hello World Spring boot";
	}
    @GetMapping("/helloworldbean")
public HelloWorldBean helloWorldBean() {
	return new HelloWorldBean("Hello World Bean Message");
	
}

    @GetMapping(path = "/internationalized")
    public String internationalization(@RequestHeader(name="Accept-Language", required= false) Locale locale) {
    	return  messagesource.getMessage("good.morning.message", null, locale);
    }
	
}
