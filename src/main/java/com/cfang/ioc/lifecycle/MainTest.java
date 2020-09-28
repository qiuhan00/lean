package com.cfang.ioc.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cfang 2020/9/21 16:29
 * @description
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println(context.getBean(Car.class));

        context.close();
    }
}
