package com.webapp.controller;

import com.webapp.model.User;

public class LoginController {

	public String login() {
		
		return "login/loginform";
		
		
	}
	
	public String login(User user) {
		
		return "login/success";
		
		
	}
	
	
}
