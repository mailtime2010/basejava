package com.basejava.webapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFileOutputStream {
    public static void main(String[] args) {
        String sourse = "Now is time for all good man\n" + "to come to the aid of their country\n" + "and play their due taxes.";
        byte buf[] = sourse.getBytes();
        try(FileOutputStream f0 = new FileOutputStream("f:\\F1111.txt"); FileOutputStream f1 = new FileOutputStream("f:\\F2222.txt"); FileOutputStream f2 = new FileOutputStream("f:\\F3333.txt");) {
            //write data to first file
            for(int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            //write data to second file
            f1.write(buf);
            //write data to third file
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            System.out.println("Cause mistake in-out");
        }
        try(FileInputStream in = new FileInputStream("f:\\F1111.txt")) {
            byte bf[] = new byte[in.available()];
            while(in.available() > 0) {
                in.read(bf);
            }
            for(int i = 0; i < bf.length; i++) {
                System.out.print((char) bf[i]);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            System.out.println("Cause mistake in-out");
        }
    }
}
