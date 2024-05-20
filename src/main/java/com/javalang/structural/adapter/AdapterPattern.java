package com.javalang.structural.adapter;

public class AdapterPattern {
    public static void main(String[] args) {

        System.out.println("PhonePe Interface Values");
        PhonePe phonePe = new PhonePe();
        phonePe.setCreditCardNo("5085 5955 1010 6608");
        phonePe.setCustomerName("Vineetha Raghavan");
        phonePe.setCardExpiryMonth("05");
        phonePe.setCardExpiryYear("22");
        phonePe.setCardCVVNo("223");
        phonePe.setAmount(1243.22);
        System.out.println(phonePe.toString());

        IPayTM iPayTM = new PhonePeToPayTMAdapter(phonePe);
        printPayTMValues(iPayTM);
    }

    private static void printPayTMValues(IPayTM payTM)
    {
        System.out.println("PayTM Interface Adapted Values");
        System.out.println(payTM.getCardOwnerName());
        System.out.println(payTM.getCustomerCardNo());
        System.out.println(payTM.getCardExpiryDate());
        System.out.println(payTM.getCVVNo());
        System.out.println(payTM.getTotalAmount());
    }
}
