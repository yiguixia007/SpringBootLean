package com.ego.core.mongodb.dao;

import com.ego.core.mongodb.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-26 21:15
 **/
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String FirstName);

    List<Customer> findByLastName(String lastName);
}
