package com.basejava.webapp;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This data must be in array. ";
        byte buf[] = s.getBytes();
        try {
            f.write(buf);
        } catch(IOException e) {
            System.out.println("Mistake write to buffer");
            return;
        }
        System.out.println("Buffer as a chart string");
        System.out.println(f.toString() + "but it's in buffer");
        System.out.println("To array");
        byte b[] = f.toByteArray();
        for(int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println();
        System.out.println("To thread out type OutputStream()");
        try(FileOutputStream f2 = new FileOutputStream("f:\\text.txt")) {
            f.writeTo(f2);
        } catch(IOException e) {
            System.out.println("Mistake out/put");
            return;
        }
        System.out.println("Move to Start position");
        f.reset();
        for(int i = 0; i < 3; i++) {
            f.write('X');
            System.out.println(f.toString());
        }
    }
}
