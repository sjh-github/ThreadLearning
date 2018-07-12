package com.sjh.daemonthread;

public class MyThread  extends Thread {
    private int i = 0;
    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread  = new MyThread();
        //守护线程，当不存在非守护线程时，守护线程会自动断开
        myThread.setDaemon(true);
        myThread.start();
        Thread.sleep(5000);
        System.out.println("end");

    }
}
