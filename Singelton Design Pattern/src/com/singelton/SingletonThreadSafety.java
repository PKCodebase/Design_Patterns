package com.singelton;

public class SingletonThreadSafety {

    public static SingletonThreadSafety instance;

    private SingletonThreadSafety(){

    }
    public static SingletonThreadSafety getInstance(){
        if(instance == null){
            synchronized(SingletonThreadSafety.class){
                if(instance == null){
                    instance = new SingletonThreadSafety();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            SingletonThreadSafety s1 = SingletonThreadSafety.getInstance();
            System.out.println("Thread 1: " + s1.hashCode());
        });

        Thread t2 = new Thread(()->{
            SingletonThreadSafety s2 = SingletonThreadSafety.getInstance();
            System.out.println("Thread 1: " + s2.hashCode());
        });

        t1.start();
        t2.start();
    }
}
