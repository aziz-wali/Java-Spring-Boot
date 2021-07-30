package com.blog.demo.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.demo.security.MyUserDetailsService;



@Controller
public class UserRegistrationController {
	
	@Autowired
	private MyUserDetailsService userService;
	
	@RequestMapping("registr")
	public String register() {
		
		return "home/registration.jsp";
	}
	
	
	@RequestMapping("registration")
	public String reg(
			
			Long id,
			@RequestParam("username") String username,
    		@RequestParam("first_name") String first_name,
    		@RequestParam("last_name") String last_name,
    		@RequestParam("email") String email,
    		@RequestParam("password") String password
			
			
			) {
		
		userService.saveToDB(username,first_name,last_name,email,password);
		return "Home.jsp";
	}
	

	@RequestMapping("/login")
	public String loginPage()
	{
		
		return "home/login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "home/logout.jsp";
	}
	
	 @RequestMapping("regisr")
	public String registr() {
		
		return"registration.jsp";
		}
}