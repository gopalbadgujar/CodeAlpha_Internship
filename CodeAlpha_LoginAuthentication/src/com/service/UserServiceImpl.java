package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public List<User> getUsers() {

		return dao.getAllUser();
	}

	@Override
	public User getSingleUser(int id) {
		dao.getUser(id);
		return dao.getUser(id);
	}

	@Override
	public void updateData(User u) {
		dao.updateUser(u);
	}

	@Override
	public void delUser(int id) {
		dao.deleteUser(id);
	}

	@Override
	public void registerUser(User u) {
		dao.addUser(u);
		
	}

}
