package com.admin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entities.User;
import com.admin.repositories.UserRepository;
import com.admin.services.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;

	public List<User> getList() 
	{
		return userRepository.getUserList();
	}
	public void saveRecord(User user) 
	{
		userRepository.saveUser(user);
	}
	public User getRecord(String userid) 
	{
		return userRepository.getUser(userid);
	}
	public void updateRecord(User usern) 
	{
		User usero=userRepository.getUser(usern.getUserid());
		userRepository.updateUser(usero,usern);
	}
}
