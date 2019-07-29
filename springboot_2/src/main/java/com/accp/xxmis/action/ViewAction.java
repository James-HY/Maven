package com.accp.xxmis.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewAction {
	
	@GetMapping("login")
	public String goToLogin() {
		return "login";
	}
	
	@GetMapping("msg")
	public String goToMsg() {
		return "msg";
	}
	
	
	@GetMapping("demo")
	public String goToDemo() {
		return "a/demo";
	}

}
