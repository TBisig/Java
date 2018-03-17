package com.codingdojo.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam(value="name", required=false) String name, 
			@RequestParam(value="dojo", required=false) String dojo, 
			@RequestParam(value="lang", required=false) String lang, 
			@RequestParam(value="comment", required=false) String comment,
			HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("dojo", dojo);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session) {
		return "result.jsp";
	}

}
