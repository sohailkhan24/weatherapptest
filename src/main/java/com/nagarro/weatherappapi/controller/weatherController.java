package com.nagarro.weatherappapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weatherController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {
		return "Hello World hello";
	}


}
