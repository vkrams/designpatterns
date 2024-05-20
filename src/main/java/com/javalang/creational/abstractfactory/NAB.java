package com.javalang.creational.abstractfactory;

public class NAB implements Bank {
    private final String bankName;

    public NAB() {
        bankName = "NAB";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
