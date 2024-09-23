package com.bmsquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

	@GetMapping("/colleges")
	public String colleges() {
		return "colleges";
	}
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
}
