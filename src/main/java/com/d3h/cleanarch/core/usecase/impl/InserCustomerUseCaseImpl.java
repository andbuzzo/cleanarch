package com.d3h.cleanarch.core.usecase.impl;

import com.d3h.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.d3h.cleanarch.core.dataprovider.InsertCustomer;
import com.d3h.cleanarch.core.dataprovider.SendCpfForValidation;
import com.d3h.cleanarch.core.domain.Customer;
import com.d3h.cleanarch.core.usecase.InsertCustomerUseCase;

public class InserCustomerUseCaseImpl implements InsertCustomerUseCase {
    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;
    private final SendCpfForValidation sendCpfForValidation;
    public InserCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer, SendCpfForValidation sendCpfForValidation) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }
    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);

    }
}
