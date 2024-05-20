package com.javalang.structural.flyweight;

public class CoffeeOrderContext {

    private final int tableNo;

    public CoffeeOrderContext(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getTableNo()
    {
        return tableNo;
    }
}
