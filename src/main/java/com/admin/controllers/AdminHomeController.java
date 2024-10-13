package com.admin.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminHomeController 
{
	public AdminHomeController() 
	{
		System.out.println("Controller created");
	}
	@RequestMapping("")
	//URL of this method-->http://localhost:8080/employee-timetracker/admin
	public String getHomeView(HttpSession ses)
	{
		if(ses.getAttribute("id")==null)
		{
			return "admin/home/login";
		}
		return "admin/home/home";
	}
	@RequestMapping("authenticate-user")
	//URL of this method-->http://localhost:8080/employee-timetracker/admin/authenticate-user
	public String authenticateUser(String adminid,String password,Model model,HttpSession ses)
	{
		if(adminid.equals("admin") && password.equals("cetpa"))
		{
			//Creating attribute id in session object
			ses.setAttribute("id",adminid);
			return "redirect:/admin";
		}
		model.addAttribute("id",adminid);
		model.addAttribute("msg","Authentication failed...");
		return "admin/home/login";
	}
	@RequestMapping("logout")
	public String adminLogout(HttpSession ses)
	{
		if(ses.getAttribute("id")==null)
		{
			return "admin/home/login";
		}
		ses.invalidate();
		return "admin/home/logout";
	}
}
