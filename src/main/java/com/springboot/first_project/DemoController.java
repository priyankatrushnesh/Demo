package com.springboot.first_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String Demo()
	{
		return "Well Done! You Run Successfully";
	}
}
