package com.cfang.ioc.lifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author cfang 2020/9/21 16:28
 * @description
 *
 * bean生命周期：创建 -> 初始化 -> 使用 -> 销毁
 *
 * 单例bean，容器启动的时候，bean就已经创建，容器关闭的时候，也会调用bean的销毁destory方法
 * 多例bean，容器启动的时候不创建，在获取使用的时候才进行创建，bean的销毁也不受IOC容器管理
 */
@Configuration
@ComponentScan(value = {"com.cfang.ioc.lifecycle"})
public class MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Car car(){
        return new Car();
    }

    @Bean
    public Human human(){
        return new Human();
    }
}
