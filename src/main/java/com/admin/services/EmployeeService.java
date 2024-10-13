package com.admin.services;

import java.util.List;

import com.admin.entities.Employee;

public interface EmployeeService
{
	List<Employee> getList();
	void saveRecord(Employee employee);
	void deleteRecord(int eid);
}
