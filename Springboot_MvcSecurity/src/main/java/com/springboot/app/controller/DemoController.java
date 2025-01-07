package com.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DemoController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
}
