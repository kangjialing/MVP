package com.daydayup.mvpdemo.model;

import android.os.Handler;
import android.os.Message;

/**
 * Model的具体实现
 */

public class ModelImpl implements IModel {
    private MyHandler myHandler = new MyHandler();
    private LoginListener loginListener;

    @Override
    public void login(final User user, final LoginListener loginListener) {
        this.loginListener = loginListener;
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);

                    String mobile = user.getMobile();
                    String pass = user.getPassword();

                    if (mobile.equals("186")) {
                        Message message = myHandler.obtainMessage();
                        message.what = 0;
                        myHandler.sendMessage(message);
                    } else {
                        Message message = myHandler.obtainMessage();
                        message.what = 1;
                        myHandler.sendMessage(message);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }


    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    loginListener.loginSuccess();
                    break;
                case 1:
                    loginListener.loginError();
                    break;
            }
        }
    }
}
