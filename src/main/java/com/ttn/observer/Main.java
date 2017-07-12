package com.ttn.observer;

import java.util.Random;

/**
 * Created by parampreet on 11/7/17.
 */
public class Main {
    public static void main(String[] args) {
        SMSSender smsSender = new SMSSender();
        EmailSender emailSender = new EmailSender();


        Message sportsMsgs = new Message();


        Message politicsMsgs = new Message();


        sportsMsgs.registerObserver(emailSender);

        politicsMsgs.registerObserver(emailSender);
        politicsMsgs.registerObserver(smsSender);


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(new Random().nextBoolean()) {
                        sportsMsgs.setMessage("Sports: Hi a new message");
                    }

                    if(new Random().nextBoolean()) {
                        politicsMsgs.setMessage("Politics: Hi a new message");
                    }
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
