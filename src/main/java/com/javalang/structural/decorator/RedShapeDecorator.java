package com.javalang.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw()
    {
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape)
    {
        System.out.println("Border Color: Red");
    }
}
