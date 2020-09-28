package com.cfang.loadTop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author cfang 2020/9/17 11:19
 * @description
 */
//@Component
public class TrueLoop implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        while (true){
            System.out.println(new Date());

        }
    }

}
