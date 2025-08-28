package com.infosys.spring_boot_ecommerce_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.spring_boot_ecommerce_project.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findByEmail(String email);

}
