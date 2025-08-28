package com.infosys.spring_boot_ecommerce_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.spring_boot_ecommerce_project.entity.ProductOwner;

public interface ProductOwnerRepository extends JpaRepository<ProductOwner, Integer> {
	
	public Optional<ProductOwner> findByEmail(String email);

}
