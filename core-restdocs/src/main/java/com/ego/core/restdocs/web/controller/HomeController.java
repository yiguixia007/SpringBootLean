package com.ego.core.restdocs.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @author ego
 * @since 2018-11-27 09:02
 **/

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/greeting")
    public Map<String,String> greeting(){
        return Collections.singletonMap("message", "Hello World");
    }

}
