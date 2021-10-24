package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.Ingredient;
import com.codecool.kitchenhelpers.RandomHelper;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class KitchenHelper extends Employee {
    private final Map<Ingredient, Integer> ingredients;

    public KitchenHelper(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary, RandomHelper.getRandomBoolean());
        ingredients = new HashMap<>();
        ingredients.put(Ingredient.MEAT, RandomHelper.nextInt(4));
        ingredients.put(Ingredient.POTATO, RandomHelper.nextInt(4));
        ingredients.put(Ingredient.CARROT, RandomHelper.nextInt(4));
    }

    public void giveIngredient(Ingredient ingredient, int amount) {
        ingredients.put(ingredient, amount - 1);
        System.out.println("Kitchen helper " + getName() + ": Here is " + ingredient.name() + ", Chef.\n");
    }

    public void allOutYelling() {
        System.out.println("Kitchen helper " + getName() + ": We're all out, Chef.");
    }

    public Integer checkAmountOfIngredient(Ingredient ingredient) {
        return ingredients.getOrDefault(ingredient, 0);
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }
}
