package com.cg.gmail.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class URIController {
	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
}
