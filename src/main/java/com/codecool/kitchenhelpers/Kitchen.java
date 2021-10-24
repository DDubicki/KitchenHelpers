package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.*;

import java.time.LocalDate;
import java.util.*;

public class Kitchen {

    private final double CHEF_SALARY = 1000.0;
    private final double COOK_SALARY = 700.0;
    private final double HELPER_SALARY = 500.0;

    private Chef chef;
    private List<Cook> cooks;
    private List<KitchenHelper> kitchenHelpers;

    public Kitchen(int cooksNumber, int helpersNumber) {
        generateChef();
        generateCooks(cooksNumber);
        generateHelpers(helpersNumber);
    }

    private void generateChef() {
        chef = new Chef("Gordon Ramsey", LocalDate.of(1985, 10, 25), CHEF_SALARY);
    }

    private void generateCooks(int number) {
        cooks = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Cook cook = new Cook(Names.getRandomName(), LocalDate.of(1990, 3, 10), COOK_SALARY);
            cooks.add(cook);
        }
    }

    private void generateHelpers(int number) {
        kitchenHelpers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            KitchenHelper kitchenHelper = new KitchenHelper(Names.getRandomName(), LocalDate.of(1995, 9, 16), HELPER_SALARY);
            kitchenHelpers.add(kitchenHelper);
        }
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