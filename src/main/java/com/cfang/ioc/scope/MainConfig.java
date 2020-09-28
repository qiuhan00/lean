package com.cfang.ioc.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author cfang 2020/9/21 14:21
 * @description
 */
@Configuration
public class MainConfig {

    /**
     *  Scope 配置bean作用域，默认单例模式：
     *      prototype - 多例模式，并且是懒汉式加载，在IOC容器启动的时候，不会创建对象，在第一次使用的时候才去创建
     *      singleton - 单例模式，默认饿汉式加载，在IOC启动的时候就创建对象
     *  Lazy 配置bean时候懒加载，与 Scope.singleton单例来配合上使用，容器启动的时候不创建对象，第一次使用的时候才去创建对象
     */
    @Bean
    @Lazy
    @Scope(scopeName = "prototype")
    public Person initPerson(){
        return new Person();
    }
}
