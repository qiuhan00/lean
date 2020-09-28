package com.cfang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cfang 2020/9/17 11:16
 * @description
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cfang.valid","com.cfang.unite"})
public class LearnApplicatiion {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplicatiion.class, args);
    }
}
