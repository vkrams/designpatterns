package com.javalang.structural.flyweight;

public class FlyweightPattern {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeOrder coffeeOrder1 = coffeeFactory.getCoffeeOrder("Cappocino");
        coffeeOrder1.serveOrder(new CoffeeOrderContext(1));

        CoffeeOrder coffeeOrder2 = coffeeFactory.getCoffeeOrder("Choclate");
        coffeeOrder2.serveOrder(new CoffeeOrderContext(2));

        CoffeeOrder coffeeOrder3 = coffeeFactory.getCoffeeOrder("Esspresso");
        coffeeOrder3.serveOrder(new CoffeeOrderContext(3));
    }
}
