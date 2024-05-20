package com.javalang.creational.builder;

public interface ICustomerBuilder {
    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder email(String email);
    ICustomerBuilder mobile(String mobile);
}
