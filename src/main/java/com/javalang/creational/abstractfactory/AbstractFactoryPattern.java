package com.javalang.creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPattern {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank:");
        String bankName = br.readLine();

        System.out.println("Enter the loan Type, Options: Home | Personal | Business");
        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for " + b.getBankName() + ": ");

        double rate = Double.parseDouble(br.readLine());
        System.out.println("Enter the loan amount you want to take: ");

        int loanAmount = Integer.parseInt(br.readLine());

        System.out.println("you are taking the loan from " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.setInterestRate(rate);
        System.out.println(l.calculateEMI((int) loanAmount));
    }

}
