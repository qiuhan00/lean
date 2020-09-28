package com.cfang.ioc.compantscan;

import com.cfang.ioc.compantscan.filtertype.CustomFilterType;
import com.cfang.ioc.compantscan.service.UserService;
import com.cfang.ioc.compantscan.woker.UserWoker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author cfang 2020/9/21 11:41
 * @description
 *
 * FilterType.ANNOTATION ： 注解
 * FilterType.ASSIGNABLE_TYPE ：指定类型
 * FilterType.CUSTOM ： 自定义
 */
@Configuration
//@ComponentScan(basePackages = {"com.cfang.ioc.compantscan"})
@ComponentScan(basePackages = {"com.cfang.ioc.compantscan"},
//        excludeFilters = {
//            @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
//            @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {UserService.class}),
//            @ComponentScan.Filter(type = FilterType.CUSTOM, value = {CustomFilterType.class})
//        },
        includeFilters = {
            @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {UserWoker.class})
        },useDefaultFilters = false
)
public class MainConfig {
}
