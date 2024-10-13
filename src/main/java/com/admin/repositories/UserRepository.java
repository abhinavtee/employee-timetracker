package com.admin.repositories;

import java.util.List;

import com.admin.entities.User;

public interface UserRepository 
{
	List<User> getUserList();
	void saveUser(User user);
	User getUser(String userid);
	void updateUser(User usero, User usern);
}
