package com.authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.dao.ShopCategoryDao;
import com.authentication.model.ShopCategory;
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
	
	@ Autowired
	ShopCategoryDao shopCategoryDao;
	

	@Override
	public ShopCategory getSingleData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopCategory> getAll() {
		
		return shopCategoryDao.getAll();
	}

	@Override
	public ShopCategory delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCategory save(ShopCategory Entity) throws Exception {
		// TODO Auto-generated method stub
		return shopCategoryDao.save(Entity);
	}

}
