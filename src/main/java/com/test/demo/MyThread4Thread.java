package com.test.demo;

/**
 * 集成Thread
 */
public class MyThread4Thread extends Thread {

    private String threadName;

    public MyThread4Thread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(threadName + "运行，i = " + i);
        }
    }
}
