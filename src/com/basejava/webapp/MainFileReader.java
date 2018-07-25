package com.basejava.webapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainFileReader {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("F:\\GS\\basejava\\src\\com\\basejava\\webapp\\MainFileReader.java")) {
            int c;
            // read and out the context of file
            while((c = fr.read()) != -1 ){
                System.out.print((char) c);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File can't be find");
        } catch(IOException e) {
            System.out.println("Mistake in-out" + e);
        }
    }
}