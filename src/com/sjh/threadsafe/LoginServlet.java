package com.sjh.threadsafe;

public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username, String password) {
        usernameRef = username;
        if (username.equals("a")) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordRef = password;
        System.out.println("username = " + usernameRef + ", password = " + passwordRef);
    }
}
