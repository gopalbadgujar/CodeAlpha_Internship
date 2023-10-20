package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	void addUser(User u);

	List<User> getAllUser();
	
	User getUser(int id);
	
	void updateUser(User u);

	void deleteUser(int id);
}
