package com.ttn.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parampreet on 12/7/17.
 */
public class Manager implements IManager {
    List<IMentee<String>> mentees = new ArrayList<>();


    String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
        this.submitTask();
    }

    @Override
    public void register(IMentee mentee) {
        this.mentees.add(mentee);
    }

    @Override
    public void remove(IMentee mentee) {
        this.mentees.remove(mentee);
    }

    @Override
    public void submitTask() {
        for(IMentee mentee: mentees) {
            mentee.doJob(this.task);
        }
    }
}
