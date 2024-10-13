package com.admin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.entities.Employee;
import com.admin.services.EmployeeService;

@Controller
@RequestMapping("admin/manage/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService; 
	
	@RequestMapping("list")
	public String getEmployeeList(Model model)
	{
		List<Employee> employeeList=employeeService.getList();
		model.addAttribute("elist",employeeList);
		return "admin/manage/employee/employee-list";
	}
	@RequestMapping("add")
	public String getEmployeeaddView()
	{
		return "admin/manage/employee/add-employee";
	}
	@RequestMapping("add-record")
	public String addEmployeeRecord(Employee employee)
	{
		employeeService.saveRecord(employee);
		return "redirect:list";
	}
	@RequestMapping("delete-record")
	public String deleteEmployeeRecord(int eid)
	{
		employeeService.deleteRecord(eid);
		return "redirect:list";
	}
}
