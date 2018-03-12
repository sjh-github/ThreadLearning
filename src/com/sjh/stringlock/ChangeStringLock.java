package com.sjh.stringlock;

public class ChangeStringLock {


        public void test1() {
            synchronized(this) {
                System.out.println("test1: " + Thread.currentThread().getName() + "start time :" + System.currentTimeMillis());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("test1: " + Thread.currentThread().getName() + "end time :" + System.currentTimeMillis());
            }
        }


    synchronized public void test2() {
        System.out.println("test2: " + Thread.currentThread().getName() + "start time :" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2: " + Thread.currentThread().getName() + "end time :" + System.currentTimeMillis());
    }
}
