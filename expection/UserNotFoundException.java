package com.infosys.spring_boot_ecommerce_project.expection;

public class UserNotFoundException extends RuntimeException {
  
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
