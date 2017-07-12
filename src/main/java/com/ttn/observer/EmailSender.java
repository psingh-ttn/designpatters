package com.ttn.observer;

import java.util.Observable;

/**
 * Created by parampreet on 11/7/17.
 */
public class EmailSender implements Observer<String> {

    @Override
    public void notify(String s) {
        System.out.println("EMAIL : " + s);
    }
}
