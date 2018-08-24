package com.cg.gmail.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.gmail.beans.GmailSignUp;



@Controller
public class GmailActionController {

	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("gmailSignUp") GmailSignUp gmailsignUp) {
			ModelAndView modelAndView = new ModelAndView("successful", "gmailSignUp", gmailsignUp);
		return modelAndView;
	}
}
