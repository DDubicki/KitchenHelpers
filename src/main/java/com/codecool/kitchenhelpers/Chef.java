package com.codecool.kitchenhelpers;

import java.time.LocalDate;

public class Chef extends Employees implements Cooking {

    public Chef(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cooking() {

    }

    @Override
    public void shooting(String message) {
        System.out.println(message);
    }

    private void requereIngredients() {

    }
}
