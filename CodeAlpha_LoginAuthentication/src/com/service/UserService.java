package com.service;

import java.util.List;

import com.model.User;

public interface UserService {

	void registerUser(User u);

	List<User> getUsers();

	User getSingleUser(int id);

	void updateData(User u);

	void delUser(int id);

}
