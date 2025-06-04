package com.d3h.cleanarch.dataprovider.repository;

import com.d3h.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomeRepository extends MongoRepository<CustomerEntity, String> {
}
