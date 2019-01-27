package com.prakharjain.GitEx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitControllerEx {
	
	@RequestMapping("/hi")
	public String sayHello()
	{
		return "Hi buddy";
	}
}
