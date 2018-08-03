package com.basejava.webapp;

public class MainExtendThread {
    public static void main(String[] args) {
        new NowThread();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1001);
            }
        } catch(InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}

class NowThread extends Thread {

    public NowThread() {
        super("Демонстрационый поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
