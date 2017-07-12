package com.ttn.strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by parampreet on 11/7/17.
 */
public class GZCompressionStrategy implements CompressStrategy {
    @Override
    public File compress(File file) {
        File out = null;
        try {
            out = File.createTempFile("tmp", ".gz");
            GZIPOutputStream gzipOutputStream= new GZIPOutputStream(new FileOutputStream(out));

            FileInputStream fileInputStream = new FileInputStream(file);
            int b = fileInputStream.read();
            while (b != -1) {
                gzipOutputStream.write(b);
                b = fileInputStream.read();
            }

            fileInputStream.close();
            gzipOutputStream.flush();
            gzipOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}