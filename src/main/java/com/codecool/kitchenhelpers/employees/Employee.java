package com.codecool.kitchenhelpers.employees;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private final LocalDate birthDate;
    private final double salary;

    public Employee(String name, LocalDate birthDate, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        System.out.println("Employee name is " + name);
        return name;
    }

    public void printTax() {
        double ownTax = salary * 0.99;
        System.out.println("The tax of " + name + " is " + ownTax);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", BirthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
