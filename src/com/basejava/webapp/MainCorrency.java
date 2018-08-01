package com.basejava.webapp;

public class MainCorrency {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(){
            @Override
            public void run() {
                System.out.println(getName());
            }
        }.start();
    }
}
