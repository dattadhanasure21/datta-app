package com.shyamit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {

	@GetMapping("/wish")
	public String getWish() {
	
		String msg="All the best";
		return msg;
		
	}
}
