package com.ttn.decorator;

/**
 * Created by parampreet on 11/7/17.
 */
public class Email implements IEmail{

    String message;


    public String getContents() {
        return message;
    }


}
