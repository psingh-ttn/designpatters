package com.ttn.observer;

/**
 * Created by parampreet on 11/7/17.
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
