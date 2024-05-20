package com.javalang.creational.abstractfactory;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        if (bankName == null) {
            return null;
        }
        if(bankName.equalsIgnoreCase("CBA")){
            return new CBA();
        } else if(bankName.equalsIgnoreCase("NAB")){
            return new NAB();
        } else if(bankName.equalsIgnoreCase("MAC")){
            return new MAC();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
