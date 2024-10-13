package com.admin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.entities.User;
import com.admin.services.UserService;

@Controller
@RequestMapping("admin/manage/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public String getUserList(Model model)
	{
		List<User> userList=userService.getList();
		model.addAttribute("ulist",userList);
		return "admin/manage/user/user-list";
	}
	@RequestMapping("add")
	public String getAddUserView(Model model)
	{
		return "admin/manage/user/add-user";
	}
	@RequestMapping("add-record")
	public String addUserRecord(User user)
	{
		userService.saveRecord(user);
		return "redirect:list";
	}
	@RequestMapping("edit-record")
	public String getEditRecordView(String userid,Model model)
	{
		User user=userService.getRecord(userid);
		model.addAttribute("user",user);
		return "admin/manage/user/edit-user";
	}
	@RequestMapping("update-record")
	public String updateUserRecord(User user)
	{
		userService.updateRecord(user);
		return "redirect:list";
	}
}
