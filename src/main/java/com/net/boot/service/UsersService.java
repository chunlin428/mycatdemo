package com.net.boot.service;

import java.util.List;

import com.net.boot.model.Adminusers;
import com.net.boot.model.Users;

public interface UsersService {

	public void add(Users u);
	
	List<Users> find();



	public void add(Adminusers u);

	List<Adminusers> find(int id);
	
}
