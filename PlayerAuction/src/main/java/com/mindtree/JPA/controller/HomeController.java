package com.mindtree.JPA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String hello(ModelMap model) {
		
		model.addAttribute("message", "Welcome to IPL Player Management Website");
		
		return "index";
	}

}
