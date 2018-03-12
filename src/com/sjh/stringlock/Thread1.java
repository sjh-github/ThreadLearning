package com.sjh.stringlock;

public class Thread1 extends Thread {

    private ChangeStringLock changeStringLock;

    public Thread1(ChangeStringLock changeStringLock) {
        this.changeStringLock = changeStringLock;
    }

    @Override
    public void run() {
        changeStringLock.test1();
    }
}
