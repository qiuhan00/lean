package com.cfang.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author cfang 2020/9/21 16:45
 * @description
 *
 * BeanPostProcessor：bean的创建后置处理器，拦截bean创建的过程，
 *                      postProcessBeforeInitialization - init方法之前执行
 *                      postProcessAfterInitialization - init方法之后执行
 */
@Component
public class TBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("TBeanPostProcessor.postProcessBeforeInitialization ..." + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("TBeanPostProcessor.postProcessAfterInitialization ..." + beanName);
        return bean;
    }
}
