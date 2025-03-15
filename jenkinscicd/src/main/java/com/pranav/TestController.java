package com.pranav;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/greet")
	public String greeting()
	{
		return "This is the greeting message";
	}
}
