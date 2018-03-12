package com.sjh.samenum;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (this.interrupted()) {
                System.out.println("被中断");
            }
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        myThread.interrupt();
        Thread.currentThread().interrupt();
        System.out.println(myThread.isInterrupted());
        System.out.println(myThread.isInterrupted());
    }
}
