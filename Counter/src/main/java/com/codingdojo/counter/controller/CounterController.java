package com.codingdojo.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		int count;
		if(session.getAttribute("count") == null) {
			count = 0;
		} else {
			count = (int) session.getAttribute("count");
			count++;
		}
		session.setAttribute("count", count);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String count(HttpSession session, Model model) {
		int count;
		if(session.getAttribute("count") == null) {
			count = 0;
			session.setAttribute("count", count);
		} else {
			count = (int) session.getAttribute("count");
		}
		model.addAttribute("count", count);
		return "counter.jsp";
	}
}
