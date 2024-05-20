package com.javalang.structural.facade;

import com.javalang.structural.facade.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle Shape");
    }
}
