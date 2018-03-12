package com.sjh.mythread;

public class MyThread extends Thread {
    private int count = 5;
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由线程 " + Thread.currentThread().getName() + " 计算，count = " + count);
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
