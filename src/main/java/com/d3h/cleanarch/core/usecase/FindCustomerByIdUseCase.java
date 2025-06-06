package com.d3h.cleanarch.core.usecase;

import com.d3h.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
