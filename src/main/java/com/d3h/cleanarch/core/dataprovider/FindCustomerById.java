package com.d3h.cleanarch.core.dataprovider;

import com.d3h.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
