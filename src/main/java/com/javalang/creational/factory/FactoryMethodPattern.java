package com.javalang.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class FactoryMethodPattern
{
    public static void main(String[] args) throws IOException{
        LoanFactory loanFactory = new LoanFactory();

        System.out.println("Enter the type of loan (Options: Owner | Invest | Fixed");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String loanType = br.readLine();
        System.out.print("Enter the Loan Amount: ");
        int loanAmount = Integer.parseInt(br.readLine());

        Loan loan = loanFactory.getLoan(loanType);
        loan.setInterestRate();

        System.out.println("Monthly Payments: " + loan.calculateEMI(loanAmount) + " @Interest Rate: " + loan.interestRate);
    }

}
