package com.toronto.shoppingbackend.dao;

import java.util.List;

import com.toronto.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);
	

}
 