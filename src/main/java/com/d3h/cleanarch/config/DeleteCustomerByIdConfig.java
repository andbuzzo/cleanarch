package com.d3h.cleanarch.config;

import com.d3h.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.d3h.cleanarch.core.usecase.impl.FindCustumerByIdUseCaseImpl;
import com.d3h.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustumerByIdUseCaseImpl findCustumerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustumerByIdUseCase, deleteCustomerById);
    }

}
