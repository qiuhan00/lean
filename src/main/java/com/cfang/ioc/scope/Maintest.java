package com.cfang.ioc.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cfang 2020/9/21 14:22
 * @description
 */
public class Maintest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

//        Person person1 = context.getBean(Person.class);
//        Person person2 = context.getBean(Person.class);
//
//        System.out.println(person1 == person2);
    }
}
