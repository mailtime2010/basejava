package com.basejava.webapp;

public class MainThreadCurrency {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(){
            @Override
            public void run() {
                System.out.println(getName());
            }
        }.start();
        //start second way Thread is better
        new Thread(new Runnable() {
            @Override
            public void run() {
                //don't work cause the cod inside Runnable(have not method getName) not in Thread
//                System.out.println(getName());

            }
        });
    }
}
