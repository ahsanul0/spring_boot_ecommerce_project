package com.infosys.spring_boot_ecommerce_project.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.spring_boot_ecommerce_project.dao.UserDao;
import com.infosys.spring_boot_ecommerce_project.entity.User;
import com.infosys.spring_boot_ecommerce_project.repository.UserRepository;
@Service
public class UserDaoImpl implements UserDao{
    @Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUserDao(User user) {

		return userRepository.save(user);
	}

	@Override
	public User getUserByIdDao(int userId) {
	
		return userRepository.findById(userId).orElseThrow(()-> new RuntimeException("given user id is not found" +userId));
	}

	@Override
	public User getUserByEmailDao(String userEmail) {
		
		return userRepository.findByEmail(userEmail).orElseThrow(()-> new RuntimeException("given user email is not found" +userEmail));
	}

	@Override
	public List<User> getAllUserDao() {
		
		return userRepository.findAll();
	}
	

}
