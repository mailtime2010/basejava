package com.basejava.webapp;

public class MainThreadCurrency {
    private static int counter;
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread thread0 = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " " + getState());
            }
        };
        thread0.start();
        //start second way Thread is better
        new Thread(() -> {
            //don't work cause the cod inside Runnable(have not method getName) not in Thread
            //   System.out.println(getName());
            //Right way. take current Thread and take getName
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());

        }).start();//lambda
        System.out.println(thread0.getState());
        // out 1 000 000 in one thread app
        final MainThreadCurrency mainThreadCurrency = new MainThreadCurrency();
        for(int i = 0; i < 10000; i++) {
            new Thread(() -> {// create 10 000 threads(but.. 999468)cause: all threads works with counter
                for(int j = 0; j < 100; j++) {
                    mainThreadCurrency.inc();//make one queue
                }
            }).start();
        }
        Thread.sleep(500);
        System.out.println(counter);
    }

    //synchronized only one thread can enter in inc(99990)cause: threads work after sout(counter)
    //full function synchronized
   /* private static synchronized void inc() {
        counter++;
    }*/
    //the part of function have synchronized - 988106
    //static func
   /* private static void inc() {
        double d = Math.cos(25.);
        synchronized(LOCK) {
            counter++;
        }*/

    private void inc() {
        //synchronized(this){
        //synchronized(MainThreadCurrency.class) {
        double d = Math.cos(24.);
        synchronized(this) {
        counter++;
         }
    }
}
