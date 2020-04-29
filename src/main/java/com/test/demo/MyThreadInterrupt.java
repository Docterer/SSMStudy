package com.test.demo;

public class MyThreadInterrupt implements Runnable{
    @Override
    public void run() {
        System.out.println("***进入run方法***");
        try {
            Thread.sleep(1);
            System.out.println("2.完成休眠");
        } catch (InterruptedException e) {
            System.out.println("3.休眠被终止时执行");
            return;
        }
        System.out.println("4.run执行结束");
    }
}
