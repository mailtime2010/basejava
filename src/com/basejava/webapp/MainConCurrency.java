package com.basejava.webapp;

import java.util.ArrayList;
import java.util.List;

public class MainConCurrency {
    private static final int THREADS_NUMBER = 10000;
    private int counter;
    //   private static final Object LOCK = new Object();

    public static void main(String[] args) throws IllegalStateException {

        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());

        Thread thread0 = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " " + getState());
                //    throw new IllegalStateException();
            }
        };
        thread0.start();

      /*          private void inc() {
                      synchronized(this) {
      //                counter++;
                      }
                  }*/
        new Thread(() -> System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState())).start();

        System.out.println(thread0.getState());
    //    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());


        final MainConCurrency mainConCurrency = new MainConCurrency();
        List<Thread> threads = new ArrayList<>(THREADS_NUMBER);

        for(int i = 0; i < THREADS_NUMBER; i++) {
            Thread thread = new Thread(() -> {
                for(int j = 0; j < 100; j++) {
                    mainConCurrency.inc();
                }
            });
            thread.start();
            threads.add(thread);
        }
        threads.forEach(t -> {
            try {
                t.join();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(mainConCurrency.counter);
    }

    private synchronized void inc() {
//        synchronized(this){
//            synchronized(MainConCurrency.class){
        counter++;
//                wait();
//                readFile
//                        ....
//            }
    }
}


