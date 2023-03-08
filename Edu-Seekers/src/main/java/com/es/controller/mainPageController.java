package com.es.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainPageController {

	@GetMapping("/index")
	public String showmainPage() {
		
		return "index";
		
	}
	
}
