package com.javalang.creational.abstractfactory;

public class BusinessLoan extends Loan {
    @Override
    void setInterestRate(double rate) {
        interestRate = rate;
    }
}
