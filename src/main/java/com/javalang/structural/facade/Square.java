package com.javalang.structural.facade;

import com.javalang.structural.facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square Shape");
    }
}
