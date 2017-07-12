package com.ttn.observer;

/**
 * Created by parampreet on 11/7/17.
 */
public interface Observer<T> {
    void notify(T t);
}
