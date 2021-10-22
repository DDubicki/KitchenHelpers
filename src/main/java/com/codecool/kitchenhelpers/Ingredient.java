package com.codecool.kitchenhelpers;

public enum Ingredient {
    MEAT,
    POTATO,
    CARROT;

    public Ingredient getRandomIngredient() {
        int randomNumber = RandomHelper.nextInt(3);
        Ingredient[] values = values();
        return values[randomNumber];
    }
}
