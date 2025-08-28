package com.infosys.spring_boot_ecommerce_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.spring_boot_ecommerce_project.dao.UserDao;
import com.infosys.spring_boot_ecommerce_project.entity.User;
import com.infosys.spring_boot_ecommerce_project.password.PasswordUtil;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserDao userDao;
	@Autowired
	private PasswordUtil passwordUtil;
	
	@PostMapping(value = "/saveUser")
	public ResponseEntity<?> saveUserController(@RequestBody User user){
		String encodedPass = PasswordUtil.encodePassword(user.getPassword());
		user.setPassword(encodedPass);
		User user2 = userDao.saveUserDao(user);
		return ResponseEntity.ok(user2);
	}
	

}
