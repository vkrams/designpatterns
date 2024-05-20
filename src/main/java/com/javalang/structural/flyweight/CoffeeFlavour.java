package com.javalang.structural.flyweight;

public class CoffeeFlavour implements CoffeeOrder {

    private final String coffeeFlavour;

    public CoffeeFlavour(String coffeeFlavour)
    {
        this.coffeeFlavour = coffeeFlavour;
    }

    @Override
    public void serveOrder(CoffeeOrderContext context) {
        System.out.println("Serving Coffee flavour " + coffeeFlavour + " for Table Number " + context.getTableNo());

    }
}
