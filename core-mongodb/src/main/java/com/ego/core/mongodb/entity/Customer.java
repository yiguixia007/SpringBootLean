package com.ego.core.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author ego
 * @since 2018-11-26 21:13
 **/
@Data
public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
