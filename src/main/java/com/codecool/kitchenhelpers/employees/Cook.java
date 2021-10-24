package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.RandomHelper;

import java.time.LocalDate;

public class Cook extends Employee implements Cooking {

    public Cook(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary, RandomHelper.getRandomBoolean());
    }

    @Override
    public void cooking() {
        System.out.println("...cook is cooking.\n");
    }

    @Override
    public void shouting() {
        System.out.println("Cook " + getName() + ": I'm cooking right now, Chef\n");
    }

    @Override
    public void shoutThatCantCook() {
        System.out.println(super.getName() + ": Sorry Chef, I can't cook without knife.\n");
    }

}
