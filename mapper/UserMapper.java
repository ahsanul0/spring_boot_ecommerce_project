package com.infosys.spring_boot_ecommerce_project.mapper;

import org.mapstruct.Mapper;

import com.infosys.spring_boot_ecommerce_project.dto.UserRequest;
import com.infosys.spring_boot_ecommerce_project.entity.User;

@Mapper(componentModel = "string")
public interface UserMapper {
 
public	User toUser(UserRequest request);
}
