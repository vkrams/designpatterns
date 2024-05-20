package com.javalang.creational.prototype;

public class Circle implements ShapePrototype {

    private String color;

    public Circle (String color)
    {
        this.color = color;
    }
    @Override
    public ShapePrototype clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");

    }
}

