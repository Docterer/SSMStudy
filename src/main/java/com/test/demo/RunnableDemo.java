package com.test.demo;

public class RunnableDemo {

//    public static void main(String[] args){
//        MyThread t1 = new MyThread("线程A");
//        MyThread t2 = new MyThread("线程B");
//        Thread tt1 = new Thread(t1);
//        Thread tt2 = new Thread(t2);
//        tt1.start();
//        tt2.start();
//    }

//    public static void main(String[] args){
//        MyThread4Thread t1 = new MyThread4Thread("线程A");
//        MyThread4Thread t2 = new MyThread4Thread("线程B");
//        t1.start();
//        t2.start();
//    }

    /**
     * join可以强制执行，让其他线程陷入阻塞状态
     * @param args
     */
//    public static void main(String[] args){
//        MyThread myThread = new MyThread("Mine");
//        Thread t = new Thread(myThread,"二线程");
//        t.start();
//        for(int i=0;i<=4;i++){
//            if(i>2){
//                try {
//                    t.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("主线程运行-->"+i);
//        }
//    }

    /**
     * 此为测试线程sleep()的效果，线程会睡眠一段时间，再继续执行
     * @param args
     */
//    public static void main(String[] args){
//        //实例化runnable子类对象
//        MyThreadSleep mt = new MyThreadSleep();
//        //thread其实是要执行runnable的run方法，实例化thread
//        Thread t = new Thread(mt,"线程");
//        //启动线程
//        t.start();
//    }

    /**
     * 当一个线程在运行时，另一个线程可以用interrupt来中断在运行的线程的运行状态
     * @param args
     */
//    public static void main(String[] args){
//        //实例化runnable子类
//        MyThreadInterrupt mt = new MyThreadInterrupt();
//        Thread t = new Thread(mt,"中断线程");
//        t.start();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println("休眠被终止");
//        }
//        t.interrupt();//中断线程
//    }

    /**
     * 后台线程，只要前台有个线程在运行，整个java进程就不会消失，可以设置一个后台线程，这样java线程结束了，后台线程仍在执行
     * @param args
     */
//    public static void main(String[] args){
//        MyThread mt = new MyThread("mine");
//        Thread t = new Thread(mt,"线程");
//        t.setDaemon(true);
//        t.start();
//    }

    /**
     * 设置线程的优先级，priority
     * @param args
     */
//    public static void main(String[] args){
//        Thread t1 = new Thread(new MyThread4Thread("线1"));
//        Thread t2 = new Thread(new MyThread4Thread("线2"));
//        Thread t3 = new Thread(new MyThread4Thread("线3"));
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.NORM_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }

    /**
     * 线程礼让，yield
     * @param args
     */
//    public static void main(String[] args){
//        MyThreadYield mt = new MyThreadYield();
//        Thread t1 = new Thread(mt,"线程A");
//        Thread t2 = new Thread(mt,"线程B");
//        t1.start();
//        t2.start();
//    }

    /**
     * 同步以及死锁
     * @param args
     */
    public static void main(String[] args){
        //同步代码块
        TicketDemo mt = new TicketDemo();
        Thread t1 = new Thread(mt,"售票员A");
        Thread t2 = new Thread(mt,"售票员B");
        Thread t3 = new Thread(mt,"售票员C");
        t1.start();
        t2.start();
        t3.start();
    }

}
