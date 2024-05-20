package com.javalang.creational.prototype;

// Client code
class ShapeClient {
    private ShapePrototype shapePrototype;

    // When you create a client, you give it a prototype (a shape).
    public ShapeClient(ShapePrototype shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    // This method creates a new shape using the prototype.
    public ShapePrototype createShape() {
        return shapePrototype.clone();
    }
}
