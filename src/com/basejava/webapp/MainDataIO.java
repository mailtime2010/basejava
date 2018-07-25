package com.basejava.webapp;

import java.io.*;

public class MainDataIO {
    public static void main(String[] args) {
        //write data to file primitive type
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("f:\\Numbers.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch(FileNotFoundException e) {
            System.out.println("Can't open file in");
            return;
        } catch(IOException e) {
            System.out.println("Mistake in-out" + e);
        }
        //read primitive type data from file
        try(DataInputStream din = new DataInputStream(new FileInputStream("f:\\Numbers.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Read meanings: " + d + " " + i + " " + b);
            return;
        } catch(FileNotFoundException e) {
            System.out.println("Can't open file in");
        } catch(IOException e) {
            System.out.println("Mistake in-out" + e);
        }
    }
}
