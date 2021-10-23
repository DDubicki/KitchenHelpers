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
        Ingredient ingredient = chef.requireIngredient();
        for (KitchenHelper helper : kitchenHelpers) {
            Optional<Ingredient> requiredIngredient = helper.giveIngredient(ingredient);
            if (requiredIngredient.isPresent()) {
                System.out.println(helper.getName() + ": Here is " + ingredient.name() + ", Chef.\n");
                chef.cooking();
            } else {
                helper.allOutYelling();
            }
        }
        chef.asking();
        for (Cook cook : cooks) {
            cook.shooting();
            cook.cooking();
        }
        chef.shooting();

    }
}