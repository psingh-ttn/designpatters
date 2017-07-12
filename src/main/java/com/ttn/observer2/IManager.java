package com.ttn.observer2;

/**
 * Created by parampreet on 12/7/17.
 */
public interface IManager {
    public void register(IMentee observer);

    public void remove(IMentee observer);

    public void submitTask();


}
