package com.javalang.creational.abstractfactory;

public class PersonalLoan extends Loan {
    @Override
    void setInterestRate(double rate) {
        interestRate = rate;
    }
}
