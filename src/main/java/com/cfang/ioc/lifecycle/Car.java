package com.cfang.ioc.lifecycle;

/**
 * @author cfang 2020/9/21 16:27
 * @description
 */
public class Car {
    public Car() {
        System.out.println("Car的构造方法..........");
    }

    public void init() {
        System.out.println("Car的初始化方法......init");
    }

    public void destroy() {
        System.out.println("Car的销毁方法.....destroy");
    }
}
