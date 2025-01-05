package com.example.tovodoo.vokabel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VokabelController {
	// This method handles GET requests to the "/hello" endpoint
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!";
	}
}
