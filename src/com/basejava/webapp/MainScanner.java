package com.basejava.webapp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MainScanner {

    public static void main(String[] args) throws IOException {


        int count = 0;
        double sum = 0.0;
        FileWriter fout = new FileWriter("F:/testAAA.txt");
        fout.write("2 3.4 5 6 7.4 9.1 1 0.5 готово");
        fout.close();
        FileReader fin = new FileReader("F:/testAAA.txt");
        Scanner src = new Scanner(fin);
        while(src.hasNext()) {
            if(src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if(str.equals("готово")) break;
                else {
                    System.out.println("Ошибка формата файла.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Среднее равно " + sum / count);
    }
}