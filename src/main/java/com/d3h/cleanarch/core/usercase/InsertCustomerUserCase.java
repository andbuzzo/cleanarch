package com.d3h.cleanarch.core.usercase;

import com.d3h.cleanarch.core.domain.Customer;

public interface InsertCustomerUserCase {

    void insert(Customer customer, String zipCode);
}
