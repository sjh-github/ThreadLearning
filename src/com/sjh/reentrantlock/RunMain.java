package com.sjh.reentrantlock;

public class RunMain {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(myService);
            myThread.start();
        }
    }
}
