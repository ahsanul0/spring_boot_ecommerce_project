package com.infosys.spring_boot_ecommerce_project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User extends BaseEntity{
	
   @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Order> orders;

   public String getPassword() {
	
	return null;
   }

   public void setPassword(String encodedPass) {
	// TODO Auto-generated method stub
	
   }
}
