package com.javalang.structural.bridge;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.print("And ");
        System.out.println("Assembled");
    }
}
