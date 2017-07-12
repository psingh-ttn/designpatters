package com.ttn.decorator;

/**
 * Created by parampreet on 11/7/17.
 */
public class ExternalEmailDecorator implements IEmail {

    Email email;
    ExternalEmailDecorator(Email email) {
        this.email = email;
    }

    public String getContents() {
        return this.update(this.email.getContents());
    }

    protected String update(String contents) {
        // do something
        return contents;
    }
}
