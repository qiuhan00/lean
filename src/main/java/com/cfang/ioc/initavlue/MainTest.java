package com.cfang.ioc.initavlue;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cfang 2020/9/22 11:16
 * @description
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.toString());
    }
}
