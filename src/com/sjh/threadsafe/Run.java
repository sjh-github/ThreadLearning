package com.sjh.threadsafe;

public class Run {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();
    }
}
