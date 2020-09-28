package com.cfang.ioc.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author cfang 2020/9/21 16:01
 * @description
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    /**
     * 返回bean对象
     */
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    /**
     * 设置bean类型
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 是否单例
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
