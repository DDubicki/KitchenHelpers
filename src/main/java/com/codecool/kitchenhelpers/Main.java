package com.codecool.kitchenhelpers;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Chef chef = new Chef("Gordon", LocalDate.of(1985, 10, 25), 1000.0);
//        System.out.println(chef);

        KitchenHelper helper = new KitchenHelper("Ben", LocalDate.of(1995, 4, 30), 500);

        Optional<Ingredient> ingredient = helper.giveIngredient(Ingredient.MEAT);
        if (ingredient.isPresent()) {
            Ingredient i = ingredient.get();
        }
        ingredient.ifPresent(i -> {
            System.out.println(i);
        });
    }
}
