package com.codecool.kitchenhelpers;

import java.time.LocalDate;

public class Cooks extends Employees implements Cooking {

    public Cooks(String name, LocalDate birthDate, double salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cook() {

    }

    @Override
    public void shooting(String message) {
        System.out.println(message);
    }

}
