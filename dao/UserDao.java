package com.infosys.spring_boot_ecommerce_project.dao;

import java.util.List;

import com.infosys.spring_boot_ecommerce_project.entity.User;


public interface UserDao {
	
	public User saveUserDao(User user);
	
	public User getUserByIdDao(int userId);
	
	public User getUserByEmailDao(String userEmail);
	
	public List<User> getAllUserDao();
	

}
