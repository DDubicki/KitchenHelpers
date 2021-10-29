package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.Chef;
import com.codecool.kitchenhelpers.employees.Cook;
import com.codecool.kitchenhelpers.employees.KitchenHelper;

import java.util.List;
import java.util.Optional;

public class Kitchen {
    private final Chef chef;
    private final List<Cook> cooks;
    private final List<KitchenHelper> kitchenHelpers;

    public Kitchen(Chef chef, List<Cook> cooks, List<KitchenHelper> kitchenHelpers) {
        this.chef = chef;
        this.cooks = cooks;
        this.kitchenHelpers = kitchenHelpers;
    }

    protected void cookFood() {
        if (chef.isHasKnife()) {
            produceMeals();
        } else {
            chef.shoutThatCantCook();
            chef.shoutDownTheKitchen();
        }
    }

    private void produceMeals() {
        Ingredient ingredient = chef.requireIngredient();
        Optional<KitchenHelper> helperWithIngredient = getHelperWithIngredient(ingredient);
        if (helperWithIngredient.isPresent()){
            Integer amount = helperWithIngredient.get().getIngredients().get(ingredient);
            getIngredientAndCook(ingredient, helperWithIngredient.get(), amount);
        } else {
            kitchenHelpers.forEach(KitchenHelper::allOutYelling);
            chef.shoutDownTheKitchen();
        }
    }

    private Optional<KitchenHelper> getHelperWithIngredient(Ingredient ingredient) {
        for (KitchenHelper helper : kitchenHelpers) {
            Integer quantity = helper.checkAmountOfIngredient(ingredient);
            if (quantity > 0) {
                return Optional.of(helper);
            }
        }
        return Optional.empty();
    }

    private void getIngredientAndCook(Ingredient ingredient, KitchenHelper helperWithIngredient, int amount) {
        helperWithIngredient.giveIngredient(ingredient, amount);
        chef.cooking();
        chef.asking();
        for (Cook cook : cooks) {
            if (cook.isHasKnife()) {
                cook.shouting();
                cook.cooking();
            } else {
                cook.shoutThatCantCook();
            }
        }
        chef.shouting();
    }
}