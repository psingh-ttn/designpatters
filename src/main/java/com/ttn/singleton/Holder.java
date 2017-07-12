package com.ttn.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by parampreet on 11/7/17.
 */

public class Holder {

    private static Holder holder = new Holder();

    private Holder() {
        if(holder != null) {
            throw new RuntimeException();
        }
    }

    public static Holder getInstance() {
        return holder;
    }

















    private static AtomicInteger c = new AtomicInteger();


    void increment() {
        this.c.incrementAndGet();
    }

    int get() {
        return c.get();
    }
}