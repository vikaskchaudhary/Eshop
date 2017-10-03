package com.authentication.security;

import com.authentication.model.User;

public interface UserRepository {
	User findOneByUsername(String email);
}
