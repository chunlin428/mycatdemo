package com.net.boot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.net.boot.mapper.ItemMapper;
import com.net.boot.model.Item;
import com.net.boot.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Resource
	private ItemMapper itemMapper;
	
	@Override
	public void add(Item i) {
		itemMapper.add(i);		
	}

	@Override
	public List<Item> find() {
		return itemMapper.find();
	}

	
	
}
