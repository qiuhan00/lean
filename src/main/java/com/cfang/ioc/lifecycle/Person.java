package com.cfang.ioc.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author cfang 2020/9/21 16:41
 * @description
 */
@Component
public class Person {

    public Person(){
        System.out.println("Person构造方法...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Person PostConstruct...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Person destroy...");
    }
}
