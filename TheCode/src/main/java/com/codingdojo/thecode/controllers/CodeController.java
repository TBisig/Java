package com.codingdojo.thecode.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
	@RequestMapping(path="/submit", method=RequestMethod.POST)
	public String submit(@RequestParam(value="code", required=true) String code, RedirectAttributes redirectAttributes) {
		String path = "";
		if(code.equals("bushido")) {
			path = "redirect:/code";
		} 
		else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			path = "redirect:/";
		}
		return path;
	}
	
	@RequestMapping("/code")
	public String index() {
		return "code.jsp";
	}
}
