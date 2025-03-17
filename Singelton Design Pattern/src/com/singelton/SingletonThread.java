package com.singelton;

public class SingletonThread {
    private static SingletonThread instance;

    private SingletonThread() {
    }

    public static  SingletonThread getInstance() {
        if (instance == null) {
            instance = new SingletonThread();
        }
        return instance;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            SingletonThread s1 = SingletonThread.getInstance();
            System.out.println("Thread 1: " + s1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            SingletonThread s2 = SingletonThread.getInstance();
            System.out.println("Thread 2: " + s2.hashCode());
        });

        Thread t3 = new Thread(() -> {
            SingletonThread s3 = SingletonThread.getInstance();
            System.out.println("Thread 3: " + s3.hashCode());
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
