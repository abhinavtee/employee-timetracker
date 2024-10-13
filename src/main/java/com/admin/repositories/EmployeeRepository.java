package com.admin.repositories;

import java.util.List;

import com.admin.entities.Employee;

public interface EmployeeRepository 
{
	List<Employee> getEmployeeList();
	void saveEmployee(Employee employee);
	Employee getEmployee(int eid);
	void deleteEmployee(Employee employee);
}
