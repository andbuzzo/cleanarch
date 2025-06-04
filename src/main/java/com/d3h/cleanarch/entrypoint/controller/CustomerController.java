package com.d3h.cleanarch.entrypoint.controller;

import com.d3h.cleanarch.core.usercase.InsertCustomerUserCase;
import com.d3h.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.d3h.cleanarch.entrypoint.controller.request.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUserCase insertCustomerUserCase;

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUserCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
