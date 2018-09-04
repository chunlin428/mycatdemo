package com.net.boot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.net.boot.mapper.AdminUsersMapper;
import com.net.boot.model.Adminusers;
import com.net.boot.service.UsersService;
import org.springframework.stereotype.Service;

import com.net.boot.mapper.UsersMapper;
import com.net.boot.model.Users;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public void add(Users u) {
		usersMapper.add(u);
	}

	@Override
	public List<Users> find() {
		return usersMapper.find();
	}



	@Resource
	private AdminUsersMapper adminUsersMapper;

	@Override
	public void add(Adminusers u) {
		adminUsersMapper.add(u);
	}

	@Override
	public List<Adminusers> find(int id) {
		return adminUsersMapper.find();
	}
	
	
	
	
}
