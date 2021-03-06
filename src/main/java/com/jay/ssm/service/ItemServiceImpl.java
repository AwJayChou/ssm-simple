package com.jay.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.ssm.mapper.ItemMapper;
import com.jay.ssm.po.Item;
import com.jay.ssm.po.ItemExample;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper mapper;
	
	@Override
	public List<Item> queryItemList() {
		ItemExample example = new ItemExample();
		List<Item> list = mapper.selectByExample(example );
		return list;
	}

}
