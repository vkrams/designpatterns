package com.javalang.structural.adapter;

public class PhonePe implements IPhonePe{

    private String creditCardNo;
    private String customerName;
    private String cardExpiryMonth;
    private String cardExpiryYear;
    private String cardCVVNo;
    private Double amount;

    @Override
    public String toString() {
        return "PhonePe{" +
                "creditCardNo='" + creditCardNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", cardExpiryMonth='" + cardExpiryMonth + '\'' +
                ", cardExpiryYear='" + cardExpiryYear + '\'' +
                ", cardCVVNo='" + cardCVVNo + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    @Override
    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    @Override
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    @Override
    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    @Override
    public String getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public void setCardCVVNo(String cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
