package com.test.demo;

/**
 * 买票示例
 */
public class TicketDemo implements Runnable{

    private int TicktNum = 5;
//    @Override
//    public void run() {
//        for (int i = 0; i <5 ; i++) {
//            synchronized (this){
//                if(TicktNum>0){
//                    try {
//                        Thread.sleep(300);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"卖票：TicktNum = " + TicktNum--);
//                }
//            }
//
//        }
//    }

    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            this.sale();
        }
    }

    private synchronized void sale(){
        if(TicktNum>0){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票：TicktNum = " + TicktNum--);
        }
    }
}
