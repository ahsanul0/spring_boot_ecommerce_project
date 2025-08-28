package com.infosys.spring_boot_ecommerce_project.exception.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EcommerceExpectionHandler {
	@ExceptionHandler
	public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException expection){
		Map<String, String> map = new HashMap<>();
		BindingResult bindingResult = expection.getBindingResult();
		List<ObjectError> fieldErrors = bindingResult.getAllErrors();
		for(ObjectError fieldError : fieldErrors) {
			map.put(null, null);
		}
		return new ResponseEntity(expection.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
