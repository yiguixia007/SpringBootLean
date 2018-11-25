package com.ego.core.helloworld.web.controller;

import com.ego.core.helloworld.common.config.ConfigBean;
import com.ego.core.helloworld.common.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ego
 * @since 2018-11-18 10:08
 **/
@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
@RequestMapping("/lucy")
public class LucyController {

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private User user;

    @GetMapping("/show")
    public String show(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @GetMapping("/user")
    public String user(){
        return user.getName() + "：" + user.getAge();
    }
}