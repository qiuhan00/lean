package com.cfang.ioc.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author cfang 2020/9/21 14:41
 * @description
 */
public class Userconditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if(null != context.getBeanFactory().getBean(UserLog.class)){
            return true;
        }
        return false;
    }
}
