package com.d3h.cleanarch.dataprovider;

import com.d3h.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.d3h.cleanarch.core.domain.Address;
import com.d3h.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.d3h.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
