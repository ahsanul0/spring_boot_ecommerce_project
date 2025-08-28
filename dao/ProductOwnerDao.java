package com.infosys.spring_boot_ecommerce_project.dao;

import java.util.List;

import com.infosys.spring_boot_ecommerce_project.entity.ProductOwner;

public interface ProductOwnerDao {

	public ProductOwner saveProductOwnerDao (ProductOwner owner);
	
	public ProductOwner getProductOwnerByIdDao(int productOwnerId);  
	
	public ProductOwner getProductOwnerByEmailDao(int productOwnerEmail);
	
	public List<ProductOwner> getAllProductOwnersDao();
	
	
	
}

