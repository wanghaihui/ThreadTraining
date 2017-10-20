package com.story.threadtraining;

import android.util.Log;

/**
 * Created by tuyoo on 2017/10/20.
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();

        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                Log.d(Constants.TAG, Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
