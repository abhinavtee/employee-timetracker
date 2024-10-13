package com.admin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entities.Employee;
import com.admin.repositories.EmployeeRepository;
import com.admin.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getList() 
	{
		return employeeRepository.getEmployeeList();
	}
	public void saveRecord(Employee employee) 
	{
		employeeRepository.saveEmployee(employee);
	}
	public void deleteRecord(int eid) 
	{
		Employee employee=employeeRepository.getEmployee(eid);
		employeeRepository.deleteEmployee(employee);
	} 
}
