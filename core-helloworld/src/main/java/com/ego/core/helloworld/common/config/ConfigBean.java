package com.ego.core.helloworld.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ego
 * @since 2018-11-24 16:50
 **/
@ConfigurationProperties(prefix = "my")
@Data
@Component
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
}
