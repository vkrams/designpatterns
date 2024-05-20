package com.javalang.creational.singleton;

public class MultiThread {
    public static void main(String[] args) {

        System.out.println("Singleton object with Multithreaded demonstration");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("First Instance");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Second Instance");
            System.out.println(singleton.value);
        }
    }
}
