package com.cfang.ioc.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cfang 2020/9/21 16:02
 * @description
 */
@Configuration
public class MainConfig {

    @Bean("personFactoryBean")
    public PersonFactoryBean initBean(){
        return new PersonFactoryBean();
    }
}
