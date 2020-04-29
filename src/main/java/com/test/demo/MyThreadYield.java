package com.test.demo;

public class MyThreadYield implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"运行i="+i);
            if(i==2){
                System.out.println("礼让了");
                Thread.yield();
            }
        }
    }
}
