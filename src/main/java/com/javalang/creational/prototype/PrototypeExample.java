package com.javalang.creational.prototype;

// Main class
public class PrototypeExample {
    public static void main(String[] args) {
        // Create a concrete prototype (a red circle).
        ShapePrototype circlePrototype = new Circle("red");

        // Create a client and give it the prototype.
        ShapeClient client = new ShapeClient(circlePrototype);

        // Use the prototype to create a new shape (a red circle).
        ShapePrototype redCircle = client.createShape();

        // Draw the newly created red circle.
        redCircle.draw();
    }
}