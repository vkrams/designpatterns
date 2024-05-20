package com.javalang.structural.proxy;

public class ProxyPattern {

    public static void main(String[] args) {
        OfficeInternetAccess access1 = new ProxyInternetAccess("Sunil");
        access1.grantInternetAccess();
        OfficeInternetAccess access2 = new ProxyInternetAccess("Anil");
        access2.grantInternetAccess();
    }
}
