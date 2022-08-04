package com.shyamit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shyamit.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookMsg(Model model) {
		Book b1= new Book(101,"Spring",450.0);
		Book b2= new Book(102,"Hibernate",250.0);
		Book b3= new Book(103,"deveops",550.0);
		Book b4= new Book(104,"html",300.0);
		Book b5= new Book(105,"Java",650.32);
		Book b6= new Book(106,"oracle",650.32);
		
		
		List<Book> list = Arrays.asList(b1,b2,b3,b4,b5,b6);
		model.addAttribute("books",list);
		
	/*	
		model.addAttribute("book1",b1);
		model.addAttribute("book2",b2);
		model.addAttribute("book3",b3);
*/
		return "book";
		
	}
}
