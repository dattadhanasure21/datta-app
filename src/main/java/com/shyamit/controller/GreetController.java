package com.shyamit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GreetController {
	@GetMapping("/greet")
public String getGreet(Model model) {
	String txt= "Good morning";
	model.addAttribute("msg",txt);
	return "greet";
}
}
