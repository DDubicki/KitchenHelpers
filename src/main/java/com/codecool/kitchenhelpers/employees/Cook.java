package com.codecool.kitchenhelpers.employees;

import java.time.LocalDate;

public class Cook extends Employee implements Cooking {

    public Cook(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cooking() {
        System.out.println("...cooks is cooking now.");
    }

    @Override
    public void shooting(String message) {
        System.out.println(message);
    }

}
