package com.cfang.ioc.initavlue;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author cfang 2020/9/22 11:11
 * @description
 */
public class Person {

    @Value("商业")
    private String name;
    @Value("#{28-8}")
    private Integer year;
    @Value("${name}")
    private String lname;

    @Override
    public String toString() {
        return name + lname + year;
    }
}
