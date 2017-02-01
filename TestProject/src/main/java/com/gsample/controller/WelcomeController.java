package com.gsample.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		return "welcome";
	}

}