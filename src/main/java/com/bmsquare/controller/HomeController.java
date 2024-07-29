package com.bmsquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping({ "/index", "/" })
	public String home() {
		return "home";
	}

	@GetMapping("/about-us")
	public String aboutUs() {
		return "about_us";
	}

	@GetMapping("/admission")
	public String admission() {
		return "admission";
	}

	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}

	@GetMapping("/colleges")
	public String colleges() {
		return "colleges";
	}
}
