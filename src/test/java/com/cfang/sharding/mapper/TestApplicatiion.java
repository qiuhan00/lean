package com.cfang.sharding.mapper;

import com.cfang.sharding.entity.OaSendMsg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cfang 2020/9/17 11:16
 * @description
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cfang.sharding"})
public class TestApplicatiion {

    public static void main(String[] args) {
        SpringApplication.run(TestApplicatiion.class, args);
    }
}
