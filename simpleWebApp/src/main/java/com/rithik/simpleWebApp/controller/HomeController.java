package com.rithik.simpleWebApp.controller;


//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {

	@RequestMapping("/")
	public String greet() {
		return "Welcome to SimpleWebApp";
	}
	
	@RequestMapping("/about")	
	public String about() {
		return "we to SimpleWebApp About page";
	}
}



/* @Controller followed by @ResponseBody 
 * 
 * or 
 * 
 * @RestController
 * */
