package com.codecool.kitchenhelpers.employees;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private final LocalDate birthDate;
    private final double salary;
    private final boolean hasKnife;

    public Employee(String name, LocalDate birthDate, double salary, boolean hasKnife) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
        this.hasKnife = hasKnife;
    }

    public String getName() {
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

    public boolean isHasKnife() {
        return hasKnife;
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
