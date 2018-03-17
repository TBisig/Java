package com.codingdojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHuman {
	@RequestMapping("/")	
	public String index(Model model, @RequestParam(value="name", defaultValue="Human" ) String name) {
		model.addAttribute("name", name);
		return "index.jsp";
	}

}
