package com.d3h.cleanarch.core.usercase.impl;

import com.d3h.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.d3h.cleanarch.core.dataprovider.InsertCustomer;
import com.d3h.cleanarch.core.domain.Customer;
import com.d3h.cleanarch.core.usercase.InsertCustomerUserCase;

public class InserCustomerUserCaseImpl implements InsertCustomerUserCase {
    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;
    public InserCustomerUserCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }
    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);

    }
}
