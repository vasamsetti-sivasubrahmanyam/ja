package com.cg.payroll.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.payroll.beans.Associate;

@Controller
public class URIController {

	
	@RequestMapping("/")
	public String getIndexPage() {
		return "indexPage";
	}
	
	
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	
	@ModelAttribute("associate")
		public Associate getAssociate() {
		return new Associate();
	}
}
