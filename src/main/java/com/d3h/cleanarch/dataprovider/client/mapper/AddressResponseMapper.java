package com.d3h.cleanarch.dataprovider.client.mapper;

import com.d3h.cleanarch.core.domain.Address;
import com.d3h.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
