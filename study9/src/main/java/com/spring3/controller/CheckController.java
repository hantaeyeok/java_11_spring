package com.spring3.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring3.util.Check;
import com.spring3.util.CheckVO;
import com.spring3.util.CheckValidator;

@Controller
@RequestMapping("/check")
public class CheckController {
	
	@GetMapping("/")
	public String checkHome(Model model) {
		return "check/home";
	}
	
	@GetMapping("/check1.do")
	public String check1(Model model) {
		return "check/check1";
	}
	
	@PostMapping("/check1pro.do")
	public String check1pro(@ModelAttribute("check") Check check, Model model) {
		model.addAttribute("id",check.getId());
		model.addAttribute("pw",check.getPw());
		return "check/check1_result";
	}
	
	@GetMapping("/check2.do")
	public String check2(Model model) {
		return "check/check2";
	}
	
	@PostMapping("/check2pro.do")
	public String check2pro(@ModelAttribute("check") Check check, Model model) {
		model.addAttribute("id",check.getId());
		model.addAttribute("pw",check.getPw());
		return "check/check2_result";
	}
	
	@GetMapping("/check3.do")
	public String check3(Model model) {
		return "check/check3";
	}
	
	@GetMapping("/check3pro.do")
	public String check3pro(@ModelAttribute("check") Check check, Model model) {
		model.addAttribute("id",check.getId());
		model.addAttribute("pw",check.getPw());
		return "check/check3_result";
	}
	
	@GetMapping("/check4.do")
	public String check4(Model model) {
		return "check/check4";
	}
	
	@PostMapping("/check4pro.do")
	public String check4pro(@ModelAttribute("check") Check check, Model model, BindingResult result) {
		String page = "check/check4_result";
		CheckValidator ckVal = new CheckValidator();
		ckVal.validate(check, result);
		if(result.hasErrors()) {
			page = "check/error4";
		} else {
			model.addAttribute("id",check.getId());
			model.addAttribute("pw",check.getPw());
		}
		return page;
	}
	
	@InitBinder("check")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new CheckValidator());
	}
	
//	@InitBinder("chk")
//	protected void initBinder2(WebDataBinder binder) {
//		binder.setValidator(new CheckValidator2());
//	}
	
	@GetMapping("/check5.do")
	public String check5(Model model) {
		return "check/check5";
	}
	
	@PostMapping("/check5pro.do")
	public String check5pro(@ModelAttribute("check") @Valid Check check, Model model, BindingResult result) {
		String page = "check/check5_result";
		if(result.hasErrors()) {
			page = "check/error5";
		} 
		return page;
	}
	@GetMapping("/check6.do")
	public String check6(Model model) {
		return "check/check6";
	}
	
	@PostMapping("/check6.do")
	public String check5pro(@ModelAttribute("cnk") @Valid CheckVO cnk, Model model, BindingResult result) {
		String page = "check/check6_result";
		model.addAttribute("cnk",cnk);
		return page;
	}

}
