package com.net.boot.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.net.boot.model.Adminusers;
import com.net.boot.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.boot.model.Users;

@RestController
public class UserController {

	@Resource
	private UsersService usersService;


	@RequestMapping("/user/add")
	public String add(String name) {
		Users u = new Users();
		u.setName(name).setIndate(new Date());
		usersService.add(u);
		return "插入成功";
	}
	
	@RequestMapping("/user/find")
	public List<Users> find() {
		return usersService.find();
	}



	@RequestMapping("/adminuser/add")
	public String add1(String name, Integer userid) {
		Adminusers u = new Adminusers();
		u.setName(name).setIndate(new Date());
		u.setUserid(userid);
		usersService.add(u);
		return "插入成功";
	}

	@RequestMapping("/adminuser/find")
	public List<Adminusers> find2() {
		return usersService.find(1);
	}
	
}
