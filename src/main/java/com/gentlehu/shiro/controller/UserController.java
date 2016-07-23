package com.gentlehu.shiro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping("/info")
	public String info(HttpServletRequest request,Model model){
		String currentUser = (String) request.getSession().getAttribute("currentUser");
		System.out.println("currentUser"+currentUser);
		model.addAttribute("currentUser", currentUser);
		return "user/info.jsp";
	}
}
