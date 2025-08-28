package com.infosys.spring_boot_ecommerce_project.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private double price;
	private int stock;
	
	@Value(value = "no")
	private String verification;
	
	@ManyToOne
	@JoinColumn(name = "ownerid")
   private ProductOwner owner;
	
	@ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
	private List<Order> orders;
	
}
