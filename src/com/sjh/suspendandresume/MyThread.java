package com.sjh.suspendandresume;


public class MyThread extends Thread {
    private long count = 0;

    @Override
    public void run() {
        /*while (true) {
            i++;
        }*/
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            count++;
            //Thread.yield();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));

    }

    public static void main(String[] args) {
            MyThread myThread = new MyThread();
            myThread.start();
           /* Thread.sleep(5000);
            myThread.suspend();
            System.out.println("A = " + System.currentTimeMillis() + " ,i = " + myThread.getI());
            myThread.resume();
            Thread.sleep(5000);
            myThread.suspend();
            System.out.println("B = " + System.currentTimeMillis() + " ,i = " + myThread.getI());
            Thread.sleep(5000);
            myThread.resume();
            System.out.println("C = " + System.currentTimeMillis() + " ,i = " + myThread.getI());*/

    }
}
