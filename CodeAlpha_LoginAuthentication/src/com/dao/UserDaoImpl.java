package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void addUser(User u) {
		Session session = sf.openSession();
		session.save(u);
		session.beginTransaction().commit();

	}

	@Override
	public List<User> getAllUser() {
		Session session = sf.openSession();
		Query<User> query = session.createQuery("from User");
		List<User> u = query.getResultList();
		return u;
	}

	@Override
	public User getUser(int id) {
		Session session = sf.openSession();
		User u = session.get(User.class, id);
		return u;
	}

	@Override
	public void updateUser(User u) {
		Session session = sf.openSession();
		session.update(u);
		session.beginTransaction().commit();

	}

	@Override
	public void deleteUser(int id) {
		Session session = sf.openSession();
		User u = session.get(User.class, id);
		session.delete(u);
		session.beginTransaction().commit();
	}

}
