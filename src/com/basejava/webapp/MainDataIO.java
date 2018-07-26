package com.basejava.webapp;

import java.io.*;

public class MainDataIO {
    public static void main(String[] args) {
        //write data to file primitive type
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("f:\\Numbers.dat"))) {
            dos.writeDouble(98.6);
            dos.writeInt(1000);
            dos.writeBoolean(true);
        } catch(FileNotFoundException e) {
            System.out.println("Can't open file output");
            return;
        } catch(IOException e) {
            System.out.println("Mistake in-out" + e);
        }
        //read primitive type data from file
        try(DataInputStream dis = new DataInputStream(new FileInputStream("f:\\Numbers.dat"))) {
            double d = dis.readDouble();
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            System.out.println("Read meanings: " + d + " " + i + " " + b);
        } catch(FileNotFoundException e) {
            System.out.println("Can't open file input");
        } catch(IOException e) {
            System.out.println("Mistake in-out" + e);
        }
    }
}
