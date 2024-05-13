package com.spring3.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring3.dto.Sample;
import com.spring3.service.SampleService;

@Controller
@RequestMapping("/test2/")
public class TestController2 {
	
	
	@Autowired
	private SampleService sampleService;
	
	
	@GetMapping("get1.do")
	public String get1(@RequestParam("num") int num,@RequestParam("title") String title, Model modle) {
		modle.addAttribute("num",num);
		modle.addAttribute("title",title);
		return "test2/get1";
	}
	
	@GetMapping("get2.do")
	public String get2(Sample sample, Model modle) {
		modle.addAttribute("test2",sample);
		return "test2/get2";
	}
	
	@GetMapping("get3.do")
	public String get3(@ModelAttribute("sam") Sample sample, Model modle) {
		//modle.addAttribute("test2",sample);
		return "test2/get3";
	}
	
	//get방식에서만 사용 가능 
	@GetMapping("get4.do/{num}/{title}")
	public String get4(@PathVariable("num") int num, @PathVariable("title") String title, Model model) {
		Sample test = new Sample(num, title, "2024-05-09");
		model.addAttribute("test",test);
		return "test2/get4";
	}
	//손절 잘 안씀
	@GetMapping("get5.do")
	public ModelAndView get5(@RequestParam("num") int num,@RequestParam("title") String title, ModelAndView mav) {
		mav.addObject("num",num);
		mav.addObject("title",title);
		mav.setViewName("test2/get5");
		return mav;
	}
	
	//post
	@GetMapping("post.do")
	public String post(Model model) {
		return "test2/post";
	}
	
	@PostMapping("post1.do")
	public String post1(@RequestParam("num") int num,@RequestParam("title") String title, Model modle) {
		modle.addAttribute("num",num);
		modle.addAttribute("title",title);
		return "test2/post1";
	}
	
	@PostMapping("post2.do")
	public String post2(Sample sample, Model modle) {
		modle.addAttribute("test2",sample);
		return "test2/post2";
	}
	
	@PostMapping("post3.do")
	public String post3(@ModelAttribute("test") Sample sample, Model modle) {
		//modle.addAttribute("test2",sample);
		return "test2/post3";
	}
	
	//get방식에서만 사용 가능 멀티 파티 경로로 오는 것이 아니기 때문에 
	@GetMapping("post4.do/{num}/{title}")
	public String post4(@PathVariable("num") int num, @PathVariable("title") String title, Model model) {
		Sample test = new Sample(num, title, "2024-05-09");
		model.addAttribute("test",test);
		return "test2/post4";
	}
	//손절 잘 안씀
	@PostMapping("post5.do")
	public ModelAndView post5(@RequestParam("num") int num,@RequestParam("title") String title, ModelAndView mav) {
		mav.addObject("num",num);
		mav.addObject("title",title);
		mav.setViewName("test2/post5");
		return mav;
	}
	
}