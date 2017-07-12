package com.ttn.observer;

/**
 * Created by parampreet on 11/7/17.
 */
public class SMSSender implements Observer<String> {

    @Override
    public void notify(String s) {
        System.out.println("SMS : " + s);
    }
}
