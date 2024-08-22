package com.bmsquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/admin-login")
	public String login() {
		return "admin/login";
	}
	@GetMapping("/forgot-password")
	public String forgotPassword() {
		return "admin/forget_pass";
	}
}
