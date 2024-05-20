package com.javalang.structural.adapter;

public class PhonePeToPayTMAdapter implements IPayTM {

    private String customerCardNo;
    private String cardOwnerName;
    private String cardExpiryDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final PhonePe phonePe;

    public PhonePeToPayTMAdapter(PhonePe phonePe) {
        this.phonePe = phonePe;
        setProp();
    }

    @Override
    public String getCustomerCardNo() {
        return customerCardNo;
    }

    @Override
    public void setCustomerCardNo(String customerCardNo) {
        this.customerCardNo = customerCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    @Override
    public void setCVVNo(Integer cvvNo) {
        this.cVVNo = cvvNo;
    }

    public Integer getcVVNo() {
        return cVVNo;
    }

    public void setcVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp()
    {
        setCardOwnerName(this.phonePe.getCustomerName());
        setCustomerCardNo(this.phonePe.getCreditCardNo());
        setCardExpiryDate(this.phonePe.getCardExpiryMonth()+"/"+this.phonePe.getCardExpiryYear());
        setCVVNo(Integer.parseInt(this.phonePe.getCardCVVNo()));
        setTotalAmount(this.phonePe.getAmount());
    }
}
