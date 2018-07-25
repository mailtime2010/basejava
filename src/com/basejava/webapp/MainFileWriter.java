package com.basejava.webapp;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {
    public static void main(String[] args) throws Exception {
        String sourse = "Now is time for all good man\n" +
                "to come to the aid of their country\n" +
                "and play their due taxes.";
        char buffer[] = new char[sourse.length()];
        sourse.getChars(0, sourse.length(), buffer, 0);
        try(FileWriter f0 = new FileWriter("f:\\F555.txt");
            FileWriter f1 = new FileWriter("f:\\F666.txt");
            FileWriter f2 = new FileWriter("f:\\F777.txt")) {
            //out in first file
            for(int i = 0; i < buffer.length; i++) {
                f0.write(buffer[i]);
            }
            //out in second file
            f1.write(buffer);
            //out in third file
            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch(IOException e) {
            System.out.println("Mistake in-out" + e);
        }
    }
}

