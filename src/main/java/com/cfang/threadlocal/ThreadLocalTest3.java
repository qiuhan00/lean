package com.cfang.threadlocal;

/**
 * @author cfang 2020/9/16 16:56
 * @description
 */
public class ThreadLocalTest3 {
    public static void main(String[] args) {

        Thread.currentThread().setName("main-test");

        ThreadLocal threadLocal = new InheritableThreadLocal();
        threadLocal.set("123");

        new Thread(() -> {
            System.out.println(threadLocal.get());
        }).start();
    }
}
