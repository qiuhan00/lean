package com.cfang.ioc.initavlue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author cfang 2020/9/22 11:14
 * @description
 */
@Configuration
@PropertySource(value = {"classpath:bean.properties"})
public class MainConfig {

    @Bean("person")
    public Person initBean(){
        return new Person();
    }

}
