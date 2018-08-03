package com.basejava.webapp;

public class MainMultiThread {
    public static void main(String[] args) {
        System.out.println("Главный поток: " + Thread.currentThread().getName());
        new OneThread("Один");
        new OneThread("Два");
        new OneThread("Три");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("Главный поток: " + Thread.currentThread().getName() + " прерван");
        }
        System.out.println("Главный поток: " + Thread.currentThread().getName()+ " завершен");
    }
}

class OneThread implements Runnable {
    String name;
    Thread t;

    public OneThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Поток: " + t.getName() + " " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Поток " + t.getName() + " прерван.");
        }
        System.out.println("Поток " + t.getName() + " завершен.");
    }
}
