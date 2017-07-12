package com.ttn.decorator;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * Created by parampreet on 11/7/17.
 */
public class Main {
    public static void main(String... args) throws Exception {
        FileInputStream fis = new FileInputStream(new File("/tmp/file"));

        BufferedInputStream bis = new BufferedInputStream(fis);

        GZIPInputStream gis1 = new GZIPInputStream(fis);
        GZIPInputStream gis2 = new GZIPInputStream(bis);


        ObjectInputStream ois = new ObjectInputStream(fis);
        ObjectInputStream ois1 = new ObjectInputStream(bis);
        ObjectInputStream ois2 = new ObjectInputStream(gis1);
        ObjectInputStream ois3 = new ObjectInputStream(gis2);





    }
}



class Car {
    String name;

    String description;
}
