package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	/*
	 * The @RequestMapping maps only to the GET method by default.
	 * To map to other HTTP methods, you'll have to specify it in the annotation.
	 */
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
}
