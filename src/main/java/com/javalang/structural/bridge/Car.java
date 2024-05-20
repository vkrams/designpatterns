package com.javalang.structural.bridge;

public class Car extends Vehicle {

    public Car (Workshop workshop1, Workshop workshop2)
    {
        super(workshop1,workshop2);
    }
    @Override
    public void manufacturer() {
        System.out.println("Manufacturing Car...");
        workshop1.work();
        workshop2.work();
    }
}
