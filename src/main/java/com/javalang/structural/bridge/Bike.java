package com.javalang.structural.bridge;

public class Bike extends Vehicle {

    public Bike (Workshop workshop1, Workshop workshop2)
    {
        super(workshop1,workshop2);
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufacturing Bike...");
        workshop1.work();
        workshop2.work();
    }

}
