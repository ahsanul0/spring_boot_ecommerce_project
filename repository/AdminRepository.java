package com.infosys.spring_boot_ecommerce_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.spring_boot_ecommerce_project.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
