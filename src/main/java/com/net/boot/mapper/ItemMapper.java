package com.net.boot.mapper;

import java.util.List;

import com.net.boot.model.Item;

public interface ItemMapper {

	public void add(Item i);
	
	List<Item> find();
	
}
