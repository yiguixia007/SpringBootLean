package com.ego.core.jpa.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author egoAccount
 * @since 2018-11-24 11:32
 **/
@Data
@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private double money;
}
