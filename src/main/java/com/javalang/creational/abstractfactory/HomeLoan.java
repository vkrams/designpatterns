package com.javalang.creational.abstractfactory;

public class HomeLoan extends Loan {
    @Override
    void setInterestRate(double rate) {
        interestRate = rate;
    }
}
