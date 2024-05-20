package com.javalang.creational.factory;

public class Owner extends Loan {
    @Override
    void setInterestRate() {
        interestRate = 5.00;
    }
}
