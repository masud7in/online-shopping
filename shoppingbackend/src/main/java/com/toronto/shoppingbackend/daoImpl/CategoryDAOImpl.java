package com.toronto.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.toronto.shoppingbackend.dao.CategoryDAO;
import com.toronto.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		//Adding first Category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//Adding second Category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for TV");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//Adding Third Category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories) {
			if (category.getId() == id) 
				return category;
		}
		
		return null;
	}

}
