package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.Chef;
import com.codecool.kitchenhelpers.employees.Cook;
import com.codecool.kitchenhelpers.employees.KitchenHelper;
import com.codecool.kitchenhelpers.employees.Names;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kitchen {

    private final double CHEF_SALARY = 1000.0;
    private final double COOK_SALARY = 700.0;
    private final double HELPER_SALARY = 500.0;

    private final Map<EmployeeType, List<Employee>> kitchenEmployees;

    public Kitchen(int cooksNumber, int helpersNumber) {
        this.kitchenEmployees = new HashMap<>();
        generateChef();
        generateCooks(cooksNumber);
        generateHelpers(helpersNumber);
    }

    private void generateChef() {
        List<Employee> chefList = new ArrayList<>();
        Chef chef = new Chef("Gordon Ramsey", LocalDate.of(1985, 10, 25), CHEF_SALARY);
        chefList.add(chef);
        kitchenEmployees.put(EmployeeType.CHEF, chefList);
    }

    private void generateCooks(int number) {
        List<Employee> cooks = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Cook cook = new Cook(Names.getRandomName(), LocalDate.of(1990, 3, 10), COOK_SALARY);
            cooks.add(cook);
        }
        kitchenEmployees.put(EmployeeType.COOK, cooks);
    }

    private void generateHelpers(int number) {
        List<Employee> kitchenHelpers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            KitchenHelper kitchenHelper = new KitchenHelper(Names.getRandomName(), LocalDate.of(1990, 3, 10), HELPER_SALARY);
            kitchenHelpers.add(kitchenHelper);
        }
        kitchenEmployees.put(EmployeeType.COOK, kitchenHelpers);
    }

    public Map<EmployeeType, List<Employee>> getKitchenEmployees() {
        return kitchenEmployees;
    }
}
