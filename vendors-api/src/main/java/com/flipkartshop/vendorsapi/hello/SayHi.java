package com.flipkartshop.vendorsapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHi {

	@RequestMapping("/hello")
	public static String sayHi() {
		return "Hi Ankit";
	}
	
}
