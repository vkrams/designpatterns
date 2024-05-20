package com.javalang.creational.factory;

public class Fixed extends Loan {
    @Override
    void setInterestRate() {
        interestRate = 5.50;
    }
}
