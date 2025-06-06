package com.d3h.cleanarch.config;

import com.d3h.cleanarch.core.usecase.impl.FindCustumerByIdUseCaseImpl;
import com.d3h.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.d3h.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.d3h.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustumerByIdUseCaseImpl findCustumerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustumerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
