package com.d3h.cleanarch.core.usecase;

import com.d3h.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
