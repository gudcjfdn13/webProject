package com.example.sbs.lolHi.controller.usr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "Hi";
	}
	
	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "bye";
	}
	
	@RequestMapping("/usr/home/plus")
	@ResponseBody
	public int plus(int a, int b) {
		return a+b;
	}

}
