package com.admin.repositories.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.admin.entities.Employee;
import com.admin.entities.User;
import com.admin.repositories.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository 
{
	private Session session;
	private Transaction transaction;
	
	public UserRepositoryImpl(SessionFactory factory)
	{
		session=factory.openSession();
		transaction=session.getTransaction();
	}

	public List<User> getUserList() 
	{
		Query<User> query=session.createQuery("from User",User.class);
		List<User> userList=query.list();
		return userList;
	}

	public void saveUser(User user) 
	{
		transaction.begin();
		session.persist(user);
		transaction.commit();
	}

	public User getUser(String userid) 
	{
		User user=session.load(User.class,userid);
		return user;
	}
	public void updateUser(User usero, User usern) 
	{
		transaction.begin();
		usero.setPassword(usern.getPassword());
		usero.setName(usern.getName());
		usero.setPhone(usern.getPhone());
		transaction.commit();
	}
}
