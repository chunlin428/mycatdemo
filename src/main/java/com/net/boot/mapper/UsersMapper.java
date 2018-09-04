package com.net.boot.mapper;

import java.util.List;

import com.net.boot.model.Users;

public interface UsersMapper {

	
	void add(Users u);
	
	List<Users> find();
	
}
