package com.cfang.ioc.compantscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cfang 2020/9/21 11:42
 * @description
 */
public class MainTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanDefinationNames = context.getBeanDefinitionNames();
        for (String beanDefinationName : beanDefinationNames) {
            System.out.println("bean的定义信息:"+beanDefinationName);
        }
    }
}

