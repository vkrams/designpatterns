package com.javalang.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {

    private final Map<String, CoffeeOrder> flavours = new HashMap<>();

    public CoffeeOrder getCoffeeOrder(String flavour)
    {
        CoffeeOrder coffeeOrder = flavours.get(flavour);
        if (coffeeOrder == null)
        {
            coffeeOrder = new CoffeeFlavour(flavour);
            flavours.put(flavour, coffeeOrder);
        }

        return coffeeOrder;
    }
}
