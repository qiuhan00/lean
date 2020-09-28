package com.cfang.threadlocal;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author cfang 2020/9/16 10:34
 * @description
 */
public class ThreadLocalTest {

    public static void main(String[] args) throws Exception{
        ThreadLocal threadLocal = new ThreadLocal();
        Thread.currentThread().setName("main-test");

        threadLocal.set("123");
        System.out.println("one:" + threadLocal.get());

        threadLocal.set("345");
        System.out.println("one-1:" + threadLocal.get());

        ThreadLocal threadLocal2 = new ThreadLocal();
        threadLocal2.set("123");
        System.out.println("second:" + threadLocal2.get());

    }

}
