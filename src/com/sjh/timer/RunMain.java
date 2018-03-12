package com.sjh.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunMain {
    private Timer timer = new Timer();
    private static class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Running, time is " + new Date());
        }
    }

    public static void main(String[ ] args) throws ParseException {
        MyTimerTask myTimerTask = new MyTimerTask();
        RunMain runMain = new RunMain();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String runTime = "2018-02-12 16:17:00";
        Date run = simpleDateFormat.parse(runTime);
        System.out.println("字符串时间为" + run.toLocaleString() + "当前时间为：" + new Date().toLocaleString());
        runMain.timer.schedule(myTimerTask, run, 4000);
    }
}
