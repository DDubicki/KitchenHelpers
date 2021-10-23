package com.codecool.kitchenhelpers.employees;

import java.time.LocalDate;

public class Cook extends Employee implements Cooking {

    public Cook(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cooking() {
        System.out.println("...cook is cooking.\n");
    }

    @Override
    public void shooting() {
        System.out.println("Cook " + getName() + ": I'm cooking right now, Chef\n");
    }

}
