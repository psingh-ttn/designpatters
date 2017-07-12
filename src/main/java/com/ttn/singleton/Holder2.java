package com.ttn.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by parampreet on 12/7/17.
 */
public enum Holder2 {



    INSTANCE;
    private int a = 1;

    private static AtomicInteger c = new AtomicInteger();


    void increment() {
        this.c.incrementAndGet();
    }

    int get() {
        return c.get();
    }
}
