package com.ttn.observer2;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by parampreet on 12/0717.
 */
public class Main {
    public static void main(String[] args) {
        Mentee menteeA = new Mentee("Kunal");


        Mentee menteeB = new Mentee("Varun");

        Manager manager = new Manager();

        manager.register(menteeA);
        manager.register(menteeB);

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String task = scanner.nextLine();

            manager.setTask(task);
        }

    }
}