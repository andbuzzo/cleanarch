package com.d3h.cleanarch.dataprovider;

import com.d3h.cleanarch.core.dataprovider.DeleteCustomerById;
import com.d3h.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
