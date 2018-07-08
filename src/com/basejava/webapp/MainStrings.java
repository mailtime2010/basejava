package com.basejava.webapp;

public class MainStrings {
    public static void main(String[] args) {
        System.out.printf("%-40s%-1s%n","1. Add task:","n -t");
        System.out.printf("%-30s%-1s%n","2. View all tasks:","v");
        System.out.printf("%-40s%-1s%n","3. Add comment:","n -c");
        System.out.printf("%-20s%5s%n","1. Add task:","n -t");
        System.out.printf("%-20s%5s%n","2. View all tasks:","v");
        System.out.printf("%-20s%5s%n","3. Add comment:","n -c");
        System.out.println("***********|*********|********|***|***************");
        int base = 5000;
        System.out.println("--------------------------------------------------");
        for(int i = 1; i < 13; i++) {

            System.out.printf("%-4s"," ");
            System.out.printf("%-10s",base);
            int i1 = (int) (0.6 * base);
            System.out.printf("%-10s", i1);
            int i2 = i1 / 20;
            System.out.printf("%-8s", i2);
            int i3 = i + 1;
            System.out.printf("%-8s", i3);
            base += (0.5 * base);
            System.out.print(base);
            System.out.println();
        }
        System.out.println(base / 5000);
    }
}
