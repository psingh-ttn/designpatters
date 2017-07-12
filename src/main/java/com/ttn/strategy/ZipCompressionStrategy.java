package com.ttn.strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by parampreet on 11/7/17.
 */
public class ZipCompressionStrategy implements CompressStrategy {
    @Override
    public File compress(File file) {
        File out = null;
        try {
            out = File.createTempFile("tmp", ".zip");
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(out));

            ZipEntry ze= new ZipEntry(file.getName());
            zipOutputStream.putNextEntry(ze);
            FileInputStream fileInputStream = new FileInputStream(file);
            int b = fileInputStream.read();
            while (b != -1) {
                zipOutputStream.write(b);
                b = fileInputStream.read();
            }
            zipOutputStream.closeEntry();

            fileInputStream.close();
            zipOutputStream.flush();
            zipOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}
