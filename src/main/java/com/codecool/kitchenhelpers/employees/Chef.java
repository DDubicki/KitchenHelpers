package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.Ingredient;

import java.time.LocalDate;

public class Chef extends Employee implements Cooking {

    public Chef(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cooking() {
        System.out.println("...chef is cooking now.");
    }

    @Override
    public void shooting(String message) {
        System.out.println(message);
    }

    public Ingredient requireIngredients() {
        Ingredient ingredient = Ingredient.getRandomIngredient();
        System.out.println(getName() + ": I need " + ingredient);
        return ingredient;
    }
}
