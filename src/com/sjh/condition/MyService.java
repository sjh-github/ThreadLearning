package com.sjh.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "start awaitA :" + System.currentTimeMillis());
            conditionA.await();
            System.out.println(Thread.currentThread().getName() + "end awaitA :" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "start awaitB :" + System.currentTimeMillis());
            conditionB.await();
            System.out.println(Thread.currentThread().getName() + "end awaitB :" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA() {
        lock.lock();
        conditionA.signalAll();
        lock.unlock();
    }

    public void signalB() {
        lock.lock();
        conditionB.signalAll();
        lock.unlock();
    }
}
