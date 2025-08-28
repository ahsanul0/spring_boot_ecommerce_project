package com.infosys.spring_boot_ecommerce_project.password;

import java.util.Base64;

public class PasswordUtil {
	
	/**
	 * we create this method to encode user password 
	 * @param password
	 * @return encoded password
	 */
	
	public static String encodePassword(String password) {
	
	return	new String(	Base64.getEncoder().encode(password.getBytes()));
	}
	
	/**
	 * we created this method to decode encoded user password 
	 * @param encodedPassword
	 * @return decoded password
	 */
	
	public static String decodePassword(String encodedPassword) {
		return new String( Base64.getDecoder().decode(encodedPassword.getBytes()));
	}

}
