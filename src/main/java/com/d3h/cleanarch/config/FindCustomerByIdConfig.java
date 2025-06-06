package com.d3h.cleanarch.config;

import com.d3h.cleanarch.core.usecase.impl.FindCustumerByIdUseCaseImpl;
import com.d3h.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustumerByIdUseCaseImpl findCustumerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustumerByIdUseCaseImpl(findCustomerById);
    }

}
