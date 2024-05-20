package com.javalang.structural.adapter;

public interface IPayTM {

    public String getCustomerCardNo();
    public String getCardOwnerName();
    public String getCardExpiryDate();
    public Integer getCVVNo();
    public Double getTotalAmount();

    public void setCustomerCardNo(String customerCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpiryDate(String cardExpiryDate);
    public void setCVVNo(Integer cvvNo);
    public void setTotalAmount(Double totalAmount);
}
