package com.javalang.creational.abstractfactory;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {

        if (loanType == null) {
            return null;
        }
        if (loanType.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loanType.equalsIgnoreCase("Personal")) {
            return new PersonalLoan();
        } else if (loanType.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        }

        return null;

    }
}
