package com.cfang.ioc.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cfang 2020/9/21 16:03
 * @description
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBean("personFactoryBean"));
        System.out.println(context.getBean("&personFactoryBean"));
    }
}
