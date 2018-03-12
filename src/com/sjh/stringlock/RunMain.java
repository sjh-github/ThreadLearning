package com.sjh.stringlock;

public class RunMain {
    public static void main(String[] args) {
        ChangeStringLock changeStringLock = new ChangeStringLock();
        for (int i = 0; i < 5; i++) {
            Thread1 thread1 = new Thread1(changeStringLock);
            thread1.start();
            Thread2 thread2 = new Thread2(changeStringLock);
            thread2.start();
        }
    }
}
