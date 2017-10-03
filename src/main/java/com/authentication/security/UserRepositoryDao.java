package com.authentication.security;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.authentication.model.User;

@Component
public class UserRepositoryDao implements UserRepository {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public User findOneByUsername(String email) {
		Session session = sessionFactory.openSession();
		Criteria cr=session.createCriteria(User.class);
		cr.add(Restrictions.eq("email", email));
		User user=(User) cr.list().get(0);
		session.close();
		return user;
	}

}
