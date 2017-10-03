package com.authentication.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.authentication.model.ShopCategory;
import com.authentication.model.User;

@Component
public class ShopCategoryDaoImpl implements ShopCategoryDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public ShopCategory getSingleData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopCategory> getAll() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Criteria cr= session.createCriteria(ShopCategory.class);
		List<ShopCategory> shopCatList=cr.list();
		return shopCatList;
	}

	@Override
	public ShopCategory delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ShopCategory save(ShopCategory Entity) throws Exception {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(Entity);
		session.getTransaction().commit();
		session.close();
		return Entity;
	}

}
