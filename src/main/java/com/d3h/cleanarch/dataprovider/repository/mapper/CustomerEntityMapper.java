package com.d3h.cleanarch.dataprovider.repository.mapper;

import com.d3h.cleanarch.core.domain.Customer;
import com.d3h.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
