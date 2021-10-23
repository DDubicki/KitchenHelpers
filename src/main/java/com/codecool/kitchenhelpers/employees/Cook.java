package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.Employee;

import java.time.LocalDate;

public class Cook extends Employee implements Cooking {

    public Cook(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cooking() {

    }

    @Override
    public void shooting(String message) {
        System.out.println(message);
    }

}
