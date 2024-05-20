package com.javalang.creational.factory;

public class LoanFactory {
    public Loan getLoan(String loanType)
    {
        if(loanType == null)
        {
            return null;
        }
        if (loanType.equalsIgnoreCase("Invest")) {
            return new Invest();
        }
        else if (loanType.equalsIgnoreCase("Fixed"))
        {
            return new Fixed();
        }
        else if (loanType.equalsIgnoreCase("Owner"))
        {
            return new Owner();
        }
        return null;
    }
}
