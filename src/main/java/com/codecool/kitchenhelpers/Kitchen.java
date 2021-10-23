package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.Chef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Kitchen {

    private final Map<Employees, Integer> kitchenEmployees;

    public Kitchen(int cooksNumber, int helpersNumber) {
        this.kitchenEmployees = new HashMap<>();
        generateChef();
        generateCooks(cooksNumber);
        generateHelpers(helpersNumber);
    }

    private void generateChef() {
        Chef chef = new Chef("Gordon Ramsey", LocalDate.of(1985, 10, 25), 1000.0);
        kitchenEmployees.put(chef, 1);
    }

    private void generateCooks(int number) {
        for (int i = 0; i < number; i++) {

        }
    }

    private void generateHelpers(int number) {

    }

    public Map<Employees, Integer> getKitchenEmployees() {
        return kitchenEmployees;
    }
}
