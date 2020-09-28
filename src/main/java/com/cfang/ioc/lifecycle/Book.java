package com.cfang.ioc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author cfang 2020/9/21 16:37
 * @description
 */
@Component
public class Book implements InitializingBean, DisposableBean {

    public Book(){
        System.out.println("Book构造方法...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destory....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet....");
    }
}
