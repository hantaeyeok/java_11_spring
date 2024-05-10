package com.spring3.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")		// 홈
public class AjaxController {
	
	private static final Logger log = LoggerFactory.getLogger(AjaxController.class);
	
	@GetMapping("/")	//			/ajax/
	public String ajaxHome() {
		return "ajax/home";
	}
	
	@GetMapping("/ajax1.do")
	public String ajaxTest1() {
		return "ajax/ajax1";
	}
	
	@ResponseBody
	@GetMapping(value="/ajax1pro.do", produces="application/json;charset=UTF-8")
	public String ajaxTest1pro() {
		String str = "Get 전송 테스트";
		log.info(str);
		return str;
	}
	
	@GetMapping("/ajax2.do")
	public String ajaxTest2() {
		return "ajax/ajax2";
	}
	
	@ResponseBody
	@PostMapping(value="/ajax2pro.do",produces="application/json;charset=UTF-8")
	public String ajaxTest2pro() {
		String str = "POST 전송 테스트";
		log.info(str);
		return str;
	}
	
	@GetMapping("/ajax3.do")
	public String ajaxTest3() {
		return "ajax/ajax3";
	}
	
	@GetMapping(value="/ajax3pro.do",produces="application/json;charset=UTF-8")
	public String ajaxTest3pro(@RequestParam("msg") String msg) {
		log.info(msg);
		return "ajax/ajax3";
	}
	
	@GetMapping("/ajax4.do")
	public String ajaxTest4() {
		return "ajax/ajax4";
	}
	
	@PostMapping(value="/ajax4pro.do",produces="application/json;charset=UTF-8")
	public String ajaxTest4pro(@RequestParam("msg") String msg) {
		log.info(msg);
		return "ajax/ajax4";
	}
	
	
	
	
}
