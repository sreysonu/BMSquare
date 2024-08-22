package com.bmsquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/dashboard")
	public String dashboard() {
		return "admin/dashboard";
	}
	@GetMapping("/add-student")
	public String addStudent() {
		return "admin/add_student";
	}
}
