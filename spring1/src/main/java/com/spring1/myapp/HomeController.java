package com.spring1.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	//localhost:8091/ => /WEB-INF/views/home.jsp
	//servlet-contex
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home~! The Client Lcale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat =DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formatDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formatDate);
		model.addAttribute("author", "한태역");
		model.addAttribute("company", "comcompany"); 
		
		
		return "home";
	}
}