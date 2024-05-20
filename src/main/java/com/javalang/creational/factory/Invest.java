package com.javalang.creational.factory;

public class Invest extends Loan {
    @Override
    void setInterestRate() {
        interestRate = 6.50;
    }
}
