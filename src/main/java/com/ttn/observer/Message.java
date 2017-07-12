package com.ttn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parampreet on 11/7/17.
 */
public class Message implements Subject {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.notifyObservers();
    }

    String message;




    List<Observer<String>> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.notify(this.getMessage());
        }
    }
}
