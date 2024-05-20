package com.javalang.creational.singleton;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("Singleton object demonstration with single thread");
        Singleton singleton = Singleton.getInstance("First Instance");
        Singleton anotherSingleton = Singleton.getInstance("Second Instance");
        System.out.println("First Singleton Value: " + singleton.value);
        System.out.println("Second Singleton Value: " + anotherSingleton.value);
    }
}
