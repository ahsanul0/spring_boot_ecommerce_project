package com.infosys.spring_boot_ecommerce_project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
@Entity
public class ProductOwner extends BaseEntity {
    @OneToMany(mappedBy = "owner", cascade =  CascadeType.ALL)
	List<Product> products;
}
