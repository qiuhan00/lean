package com.cfang.ioc.xmlbeanfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cfang 2020/9/21 11:25
 * @description
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("XmlBean.xml");

        Person person = classPathXmlApplicationContext.getBean(Person.class);
        System.out.println(person);

        Person person2 = classPathXmlApplicationContext.getBean(Person.class);
        System.out.println(person2);
    }
}
