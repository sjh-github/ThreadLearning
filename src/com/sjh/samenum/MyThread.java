package com.sjh.samenum;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (interrupted()) {
                System.out.println("被中断");
            }
//            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
//        Thread.currentThread().interrupt();
        System.out.println(myThread.isInterrupted());
        System.out.println(myThread.isInterrupted());
        Thread.currentThread().interrupt();
        System.out.println(interrupted());
        System.out.println(interrupted());
    }
}
