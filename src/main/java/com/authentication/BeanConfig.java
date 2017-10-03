package com.authentication;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Bean
	public SessionFactory getSessionfactory() {
		if(entityManagerFactory.unwrap(SessionFactory.class)==null) {
			throw new NullPointerException("Not a hibernate Session");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}

}
