package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.Ingredient;
import com.codecool.kitchenhelpers.RandomHelper;

import java.time.LocalDate;

public class Chef extends Employee implements Cooking {

    public Chef(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary, RandomHelper.getRandomBoolean());
    }

    @Override
    public void cooking() {
        System.out.println("...chef is cooking now.\n");
    }

    @Override
    public void shouting() {
        System.out.println(getName() + ": Work harder!!!\n");
        System.out.println("* * * * * * * * * * * * * * * * * *");
    }

    @Override
    public void shoutThatCantCook() {
        System.out.println(getName() + ": I don't have knives.\n");
    }

    public Ingredient requireIngredient() {
        Ingredient ingredient = Ingredient.getRandomIngredient();
        System.out.println(getName() + ": I need " + ingredient + "! NOW!!!\n");
        return ingredient;
    }

    public void asking() {
        System.out.println(getName() + ": Am I the only one who work here?\n");
    }

    public void shoutDownTheKitchen() {
        System.out.println(getName() + ": I shut down the kitchen");
    }
}
