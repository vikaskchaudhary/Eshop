package com.authentication.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.authentication.dao.UserDao;
import com.authentication.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public User getSingleData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public User delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User usr) throws Exception {
		
		if(usr.getEmail()==null) {
			throw new Exception("Email can't be null");
		}
		if(usr.getPwd()==null) {
			throw new Exception("Password can't be null");
		}if(usr.getDoc()==null) {
			usr.setDoc(new Date());
		}
		if(usr.getPwdChangeDate()==null) {
			usr.setPwdChangeDate(new Date());
				}
		if(usr.getId()==0)
		{
			usr.setAccountNonExpired(true);
			usr.setAccountNonLocked(true);
			usr.setCredentialsNonExpired(true);
			usr.setEnabled(true);
		}
		
		
		// TODO Auto-generated method stub
		return userDao.save(usr);
	}

}
