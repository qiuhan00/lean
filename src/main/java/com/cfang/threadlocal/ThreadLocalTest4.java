package com.cfang.threadlocal;

import java.util.concurrent.CountDownLatch;

/**
 * @author cfang 2020/9/16 17:46
 * @description
 */
public class ThreadLocalTest4 {

    private static String msg = "123";
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(1);
        Thread.currentThread().setName("main-test");

        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(msg);

        new Thread(() -> {
            threadLocal.set(msg);
            System.out.println(threadLocal.get());
        }, "child-test").start();


    }
}
