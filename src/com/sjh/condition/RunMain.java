package com.sjh.condition;

public class RunMain {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.start();
        threadB.start();
        Thread.sleep(3000);
        myService.signalA();
    }
}
