package com.codecool.kitchenhelpers;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class KitchenHelper extends Employees {
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
}
