package com.my.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", "", "/home", "/admin", "/user" })
	public String mainPage() {
		return "/home";
	}

	@GetMapping( "/login" )
	public String login() {
		return "/login";
	}

	@GetMapping( "/logout" )
	public String logout() {
		return "/logout";
	}

}