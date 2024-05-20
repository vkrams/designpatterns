package com.javalang.creational.abstractfactory;

abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loanType);
}
