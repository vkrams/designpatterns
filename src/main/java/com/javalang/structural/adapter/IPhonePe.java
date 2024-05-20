package com.javalang.structural.adapter;

public interface IPhonePe {

    public String getCreditCardNo();
    public String getCustomerName();
    public String getCardExpiryMonth();
    public String getCardExpiryYear();
    public String getCardCVVNo();

    public Double getAmount();

    public void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setCardExpiryMonth(String cardExpiryMonth);
    public void setCardExpiryYear(String cardExpiryYear);
    public void setCardCVVNo(String cardCVVNo);
    public void setAmount(double amount);
}
