package com.cfang.threadlocal;

import java.util.concurrent.CountDownLatch;

/**
 * @author cfang 2020/9/16 17:52
 * @description
 */
public class ThreadLocalTest5 {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal();

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        new Thread(() -> {
            set();
            System.out.println(get());
            latch.countDown();
        }).start();
        latch.await();
        System.out.println(get());
    }

    public static void set() {
        threadLocal.set(1L);
    }

    public static long get() {
        return threadLocal.get();
    }
}
