package com.infosys.spring_boot_ecommerce_project.mapper;

import org.mapstruct.Mapper;

import com.infosys.spring_boot_ecommerce_project.dto.ProductOwnerRequest;
import com.infosys.spring_boot_ecommerce_project.entity.ProductOwner;

@Mapper(componentModel = "spring")
public interface ProductOwnerMapper {
	
	ProductOwner toProductOwner(ProductOwnerRequest ownerRequest);

}
