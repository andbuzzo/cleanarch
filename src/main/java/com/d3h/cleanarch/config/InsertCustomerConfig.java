package com.d3h.cleanarch.config;

import com.d3h.cleanarch.core.usecase.impl.InserCustomerUseCaseImpl;
import com.d3h.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.d3h.cleanarch.dataprovider.InsertCustomerImpl;
import com.d3h.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InserCustomerUseCaseImpl inserCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InserCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
