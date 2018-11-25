package com.ego.core.helloworld.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ego
 * @since 2018-11-18 10:46
 **/
@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "com.ego")
@Data
public class User {

    private String name;

    private int age;
}
