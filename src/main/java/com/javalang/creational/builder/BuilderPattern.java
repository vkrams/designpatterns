package com.javalang.creational.builder;

public class BuilderPattern {

    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Shikar")
                .lastName("Dhawan")
                .email("Shikar.dhawan@gmail.com")
                .mobile("9866100100")
                .build();
        System.out.println("Customer object using Builder Pattern" + customer.toString());
    }
}
