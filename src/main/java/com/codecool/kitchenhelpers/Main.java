package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.KitchenHelper;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        KitchenHelper helper = new KitchenHelper("Ben", LocalDate.of(1995, 4, 30), 500);

        Optional<Ingredient> ingredient = helper.giveIngredient(Ingredient.MEAT);
        if (ingredient.isPresent()) {
            Ingredient i = ingredient.get();
        }
        ingredient.ifPresent(System.out::println);
    }
}
