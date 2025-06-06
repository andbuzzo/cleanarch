package com.d3h.cleanarch.core.usecase.impl;

import com.d3h.cleanarch.core.dataprovider.FindCustomerById;
import com.d3h.cleanarch.core.domain.Customer;
import com.d3h.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustumerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustumerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
