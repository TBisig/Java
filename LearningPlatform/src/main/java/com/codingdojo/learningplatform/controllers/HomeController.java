package com.codingdojo.learningplatform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/{type}/{content}")
	public String submit(
			@PathVariable String chapter,
			@PathVariable String type,
			@PathVariable String content
			){
		String path = "";
		if(type.equals("0483")) {
			path = "assignment.jsp";
		} else if(type.equals("0553")) {
			path = "lesson.jsp";
		}
		return path;
	}
}
