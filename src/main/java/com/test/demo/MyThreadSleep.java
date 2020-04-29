package com.test.demo;

public class MyThreadSleep implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
        }
    }
}
