package com.example;

public class ThreadedDebugging {
    public static void main(final String[] args) {
        Thread a = new Thread(() -> {
            while(true) {
                System.out.println("A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread b = new Thread(() -> {
            while(true) {
                System.out.println("B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        a.start();
        b.start();

    }
}
