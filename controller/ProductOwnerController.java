package com.infosys.spring_boot_ecommerce_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.spring_boot_ecommerce_project.dao.ProductOwnerDao;
import com.infosys.spring_boot_ecommerce_project.dto.ProductOwnerRequest;
import com.infosys.spring_boot_ecommerce_project.entity.ProductOwner;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "owner")
public class ProductOwnerController {
	@Autowired
	private ProductOwnerDao ownerDao;
	@Autowired
	private HttpSession httpSession;
	

	@PostMapping(value = "\saveProductOwner")
	public ResponseEntity<?> saveProductOwnerController(@RequestBody @Valid ProductOwnerRequest ownerRequest) {
	
		//return ownerRepository.save(owner);
		return ResponseEntity.ok(null);
	}

//	@Override
//	public ProductOwner getProductOwnerByIdDao(int productOwnerId) {
//		
//		return ownerRepository.findById(productOwnerId)
//				.orElseThrow(()->new RuntimeException("product owner not found " +productOwnerId));
//	}
//
//	@Override
//	public ProductOwner getProductOwnerByEmailDao(int productOwnerEmail) {
//		
//		return ownerRepository.findById(productOwnerEmail)
//				.orElseThrow(()->new RuntimeException("product owner not found " +productOwnerEmail));
//	}
//
//	@Override
//	public List<ProductOwner> getAllProductOwnersDao() {
//		// TODO Auto-generated method stub
//		return ownerRepository.findAll();
//	}

}
