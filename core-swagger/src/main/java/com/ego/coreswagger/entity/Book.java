package com.ego.coreswagger.entity;

import lombok.Data;

/**
 * @author ego
 * @since 2018-12-23 15:38
 **/
@Data
public class Book {
    private long id;
    private String name;
    private double price;

    public Book() {
    }

    public Book(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
