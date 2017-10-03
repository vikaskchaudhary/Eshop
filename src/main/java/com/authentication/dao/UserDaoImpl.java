package com.authentication.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.authentication.model.User;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public User getSingleData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(User.class);
		List<User> userList=cr.list();
		//session
		return userList;
	}

	@Override
	public User save(User usr) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(usr);
		session.getTransaction().commit();
		session.close();
		return usr;
	}

	@Override
	public User delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
