package com.sjh.stringlock;

public class Thread2 extends  Thread {
    private ChangeStringLock changeStringLock;

    public Thread2(ChangeStringLock changeStringLock) {
        this.changeStringLock = changeStringLock;
    }

    @Override
    public void run() {
        changeStringLock.test2();
    }
}
