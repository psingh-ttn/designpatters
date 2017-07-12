package com.ttn.strategy;

import java.io.File;

/**
 * Created by parampreet on 11/7/17.
 */
public class Main {
    public static void main(String... args) {
        CompressStrategy strategy = new ZipCompressionStrategy();
        File out = strategy.compress(new File("/home/parampreet/Desktop/abc"));
        System.out.println("Compressed file location:" + out.getAbsolutePath());


        strategy = new GZCompressionStrategy();
        out = strategy.compress(new File("/home/parampreet/Desktop/abc"));
        System.out.println("Compressed file location:" + out.getAbsolutePath());

    }
}
