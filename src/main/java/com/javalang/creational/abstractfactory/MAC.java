package com.javalang.creational.abstractfactory;

public class MAC implements Bank {
    private final String bankName;

    public MAC() {
        bankName = "MAC";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
