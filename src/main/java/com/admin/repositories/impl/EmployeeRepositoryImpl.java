package com.admin.repositories.impl;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.admin.entities.Employee;
import com.admin.repositories.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository 
{
	private Session session;
	private Transaction transaction;
	
	public EmployeeRepositoryImpl(SessionFactory factory)
	{
		session=factory.openSession();
		transaction=session.getTransaction();
	}

	public List<Employee> getEmployeeList() 
	{
		Query<Employee> query=session.createQuery("from Employee",Employee.class);
		List<Employee> empList=query.list();
		return empList;
	}

	public void saveEmployee(Employee employee) 
	{
		transaction.begin();
		session.persist(employee);
		transaction.commit();
	}

	public Employee getEmployee(int eid) 
	{
		Employee emp=session.get(Employee.class,eid);
		return emp;
	}

	public void deleteEmployee(Employee employee) 
	{
		transaction.begin();
		session.remove(employee);
		transaction.commit();
	}
}
 