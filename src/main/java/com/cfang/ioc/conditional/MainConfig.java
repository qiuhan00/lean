package com.cfang.ioc.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author cfang 2020/9/21 14:41
 * @description
 */
@Configuration
public class MainConfig {

//    @Bean("userLog")
    public UserLog initUserLog(){
        return new UserLog();
    }

    /**
     * 当容器中有 userLog 组件的时候，才去实例化当前bean
     */
    @Bean
    @Conditional(value = {Userconditional.class})
//    @ConditionalOnBean(value = {UserLog.class})
    public UserAspect initUseraspect(){
        return new UserAspect();
    }
}
