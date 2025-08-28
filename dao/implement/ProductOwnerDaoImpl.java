package com.infosys.spring_boot_ecommerce_project.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.spring_boot_ecommerce_project.dao.ProductOwnerDao;
import com.infosys.spring_boot_ecommerce_project.entity.ProductOwner;
import com.infosys.spring_boot_ecommerce_project.repository.ProductOwnerRepository;
@Service
public class ProductOwnerDaoImpl implements ProductOwnerDao{
	@Autowired
	private ProductOwnerRepository ownerRepository;

	@Override
	public ProductOwner saveProductOwnerDao(ProductOwner owner) {
	
		return ownerRepository.save(owner);
	}

	@Override
	public ProductOwner getProductOwnerByIdDao(int productOwnerId) {
		
		return ownerRepository.findById(productOwnerId)
				.orElseThrow(()->new RuntimeException("product owner not found " +productOwnerId));
	}

	@Override
	public ProductOwner getProductOwnerByEmailDao(int productOwnerEmail) {
		
		return ownerRepository.findById(productOwnerEmail)
				.orElseThrow(()->new RuntimeException("product owner not found " +productOwnerEmail));
	}

	@Override
	public List<ProductOwner> getAllProductOwnersDao() {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}

}
