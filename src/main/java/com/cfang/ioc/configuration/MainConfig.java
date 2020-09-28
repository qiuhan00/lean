package com.cfang.ioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cfang 2020/9/21 11:31
 * @description
 */
@Configuration
public class MainConfig {

    /**
     * 注意，当 @Bean 没有指定value或者name的时候，默认的beanName为方法名。
     */
    @Bean
    public Person person2(){
        return new Person();
    }
}
