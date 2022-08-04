package com.shyamit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomController {
	
	@GetMapping("/welcome")
public ModelAndView getWelcome() {
ModelAndView mav = new ModelAndView();
mav.addObject("msg","welcome to ShyamIt");
mav.setViewName("welcome");
	return mav;
	}
}
