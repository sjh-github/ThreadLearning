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
        myThread.setDaemon(true);
        myThread.start();
        Thread.sleep(5000);
        System.out.println("end");

    }
}
