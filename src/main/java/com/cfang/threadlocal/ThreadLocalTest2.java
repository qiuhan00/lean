package com.cfang.threadlocal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cfang 2020/9/16 14:54
 * @description
 */
public class ThreadLocalTest2 {
    public static void main(String[] args) throws Exception{

        CountDownLatch latch = new CountDownLatch(2);

        ExecutorService executors = Executors.newSingleThreadExecutor();
        executors.execute(new Thread(() -> {
            ThreadLocal threadLocal = new ThreadLocal();
            threadLocal.set("123");
            System.out.println(threadLocal.get());
            latch.countDown();
        }));

            ThreadLocal threadLocal = new ThreadLocal();
        executors.execute(new Thread(() -> {
            threadLocal.set("345");
            System.out.println(threadLocal.get());
            latch.countDown();
        }));

        latch.await();
        System.gc();
        System.out.println("end...");
    }
}
