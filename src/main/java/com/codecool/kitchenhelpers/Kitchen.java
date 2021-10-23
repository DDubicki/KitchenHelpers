package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.*;

import java.time.LocalDate;
import java.util.*;

public class Kitchen {

    private final double CHEF_SALARY = 1000.0;
    private final double COOK_SALARY = 700.0;
    private final double HELPER_SALARY = 500.0;

    private final Map<EmployeeType, List<Employee>> kitchenEmployees;
    private Chef chef;
    private List<Cook> cooks;
    private List<KitchenHelper> kitchenHelpers;

    public Kitchen(int cooksNumber, int helpersNumber) {
        this.kitchenEmployees = new HashMap<>();
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
        chef.cooking();
        chef.shooting("Work harder!!!");
        Ingredient ingredient = chef.requireIngredients();

        cooks.get(0).cooking();
        Optional<Ingredient> optionalIngredient = kitchenHelpers.get(0).giveIngredient(ingredient);


        //        Optional<Ingredient> ingredient = helper.giveIngredient(Ingredient.MEAT);
//        if (ingredient.isPresent()) {
//            Ingredient i = ingredient.get();
//        }
//        ingredient.ifPresent(System.out::println);
    }

    public Map<EmployeeType, List<Employee>> getKitchenEmployees() {
        return kitchenEmployees;
    }
}
