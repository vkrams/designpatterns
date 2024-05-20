package com.javalang.creational.abstractfactory;

public abstract class Loan {
    protected double interestRate;
    abstract void setInterestRate(double interestRate);

    public double calculateEMI(int loanAmount) {

        double monthlyInterest = interestRate / 100 / 12;
        double mathPower = Math.pow(1 + monthlyInterest, 360);
        return Math.round(loanAmount * (monthlyInterest * mathPower / (mathPower - 1)));

    }
}
