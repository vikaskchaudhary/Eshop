package com.authentication;

import java.util.List;

import com.authentication.model.User;

public interface ListService<E> {
	E getSingleData(String id);
	List<E> getAll();
	E delete(String id);
	E save(E Entity) throws Exception;

}
