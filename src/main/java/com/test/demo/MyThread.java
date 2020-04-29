package com.test.demo;

/**
 * 实现Runnable
 */
public class MyThread implements Runnable {

    private String threadName;

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + i);
        }
    }
}
