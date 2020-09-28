package com.cfang.ioc.tImport;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author cfang 2020/9/21 15:02
 * @description
 */
public class CatBeanDefiniitionRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //创建bean定义对象
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Cat.class);
        //bean定义对象注册到容器中，并设置beanName
        registry.registerBeanDefinition("cat2", rootBeanDefinition);
    }
}

