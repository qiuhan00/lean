package com.cfang.ioc.tImport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cfang 2020/9/21 14:59
 * @description
 */
public class MainTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean("cat2"));
    }
}
