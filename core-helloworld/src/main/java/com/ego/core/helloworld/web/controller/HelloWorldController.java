package com.ego.core.helloworld.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ego
 * @since 2018-11-24 16:26
 **/
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello world";
    }
}
