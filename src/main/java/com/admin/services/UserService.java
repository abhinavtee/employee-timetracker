package com.admin.services;

import java.util.List;

import com.admin.entities.User;

public interface UserService 
{
	List<User> getList();
	void saveRecord(User user);
	User getRecord(String userid);
	void updateRecord(User user);
}
