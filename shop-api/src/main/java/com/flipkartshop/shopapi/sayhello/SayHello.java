package com.flipkartshop.shopapi.sayhello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hello";
	}
}
