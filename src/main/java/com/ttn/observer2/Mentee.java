package com.ttn.observer2;

/**
 * Created by parampreet on 12/7/17.
 */
public class Mentee implements IMentee<String> {

    String name;
    public Mentee(String n) {
        name = n;
    }


    @Override
    public void doJob(String s) {
        System.out.println(this.name +": Ok Sir. doing");
    }
}
