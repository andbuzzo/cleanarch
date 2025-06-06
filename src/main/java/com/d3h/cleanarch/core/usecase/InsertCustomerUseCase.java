package com.d3h.cleanarch.core.usecase;

import com.d3h.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
