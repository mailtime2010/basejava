package com.basejava.webapp;

public class MainStrings {

    private static final int INT = 5000;


    public static void main(String[] args) {
        System.out.printf("%-40s%-1s%n", "1. Add task:", "n -t");
        System.out.printf("%-30s%-1s%n", "2. View all tasks:", "v");
        System.out.printf("%-40s%-1s%n", "3. Add comment:", "n -c");

        System.out.printf("%-20s%5s%n", "1. Add task:", "n -t");
        System.out.printf("%-20s%5s%n", "2. View all tasks:", "v");
        System.out.printf("%-20s%5s%n", "3. Add comment:", "n -c");
        int base = 5000;
        int d = 20;
        double p = 0.6;
        header();
        for(int i = 0; i < 12; i++) {

            System.out.printf("%-4s", " ");
            System.out.printf("%-10s", base);
            int i2 = secondStep(base, p);
            System.out.printf("%-10s", i2);
            int i3 = thirdStep(i2, d);
            System.out.printf("%-8s", i3);
            int i4 = throughStep(i3);
            System.out.printf("%-8s", i4);
            base = fifthStep(base, i2);
            System.out.print(base);
            System.out.println();
        }
        System.out.println(base / INT);

    }

    private static int fifthStep(int x, int secondStep) {
        return x + secondStep;
    }

    private static int throughStep(int loop) {
      return  loop/300;
    }

    private static int thirdStep(int secondStep, int d) {
        return secondStep / d;
    }

    private static int secondStep(int x, double p) {
        return (int) (x * p);
    }

    private static void header() {
        System.out.println("***********|*********|********|***|***************");
        System.out.println("--------------------------------------------------");
    }
}
