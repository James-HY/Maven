package com.accp.xxmis.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.accp.xxmis.pojo.Users;


@Controller
@RequestMapping("/c/users")
public class UersAction {
	
	

	@PostMapping("loginIn")
	public String validateUsersInfo(Model model,Users users, HttpSession session) {
		if("admin".equals(users.getUserName())&&"123".equals(users.getUserPwd())) {
			session.setAttribute("USERS",new Users("admin", "123", 0,new Date()));
			return "redirect:/c/message/getList?p=1&s=3";
		}else {
			model.addAttribute("MSG", "用户名或密码错误");
			return "login";//必须是模板文件名【转发】
		}
	}


}
