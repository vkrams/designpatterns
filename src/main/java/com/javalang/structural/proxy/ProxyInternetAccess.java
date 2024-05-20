package com.javalang.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{

    private String employeeName;
    private RealInternetAccess  realaccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess()
    {
        if(getRole(employeeName) > 6) {
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        }
        else {
            System.out.println("No Internet access granted");
        }
    }

    public int getRole(String employeeName)
    {
        int role = 0;
        if (employeeName.equalsIgnoreCase("Sunil"))
            role = 9;
        else if (employeeName.equalsIgnoreCase("Anil"))
            role = 5;
        return role;
    }
}
