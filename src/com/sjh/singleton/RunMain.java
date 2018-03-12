package com.sjh.singleton;

public class RunMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
