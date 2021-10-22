package com.codecool.kitchenhelpers;

import java.util.Date;

public class Employees {
    private String name;
    private Date BirthDate;
    private double salary;

    public String getName() {
        System.out.println("Employee name is " + name);
        return name;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void printTax() {
        double ownTax = salary * 0.99;
        System.out.println("The tax of " + name + " is " + ownTax);
    }
}
