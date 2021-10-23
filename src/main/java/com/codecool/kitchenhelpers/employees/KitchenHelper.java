package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.Ingredient;
import com.codecool.kitchenhelpers.RandomHelper;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class KitchenHelper extends Employee {
    private final Map<Ingredient, Integer> ingredients;

    public KitchenHelper(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
        ingredients = new HashMap<>();
        ingredients.put(Ingredient.MEAT, RandomHelper.nextInt(4));
        ingredients.put(Ingredient.POTATO, RandomHelper.nextInt(4));
        ingredients.put(Ingredient.CARROT, RandomHelper.nextInt(4));
    }

    public Optional<Ingredient> giveIngredient(Ingredient ingredient) {
        Integer amount = ingredients.getOrDefault(ingredient, 0);
        if (amount > 0) {
            ingredients.put(ingredient, amount - 1);
            return Optional.of(ingredient);
        }
        return Optional.empty();
    }

    public void allOutYelling() {
        System.out.println("Kitchen helper " + getName() + ": We're all out, Chef.");
    }

    public Integer checkQuantityOfIngredient(Ingredient ingredient) {
        return ingredients.getOrDefault(ingredient, 0);
    }
}
