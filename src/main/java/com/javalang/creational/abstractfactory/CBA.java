package com.javalang.creational.abstractfactory;

public class CBA implements Bank {
    private final String bankName;

    public CBA() {
        bankName = "CBA";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
