package com.justcodeit.helloworld_16_jan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// http://localhost:8090/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World..!";		
	}
}
