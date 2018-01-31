package io.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//only for get request
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	
	
}
