package com.ego.core.helloworld.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ego
 * @since 2018-11-24 16:44
 **/
@RestController
@RequestMapping("/ego")
public class EgoController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/show")
    public String show(){
        return name + ":" + age;
    }
}
