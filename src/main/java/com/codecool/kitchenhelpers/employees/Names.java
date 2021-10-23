package com.codecool.kitchenhelpers.employees;

import com.codecool.kitchenhelpers.RandomHelper;

public enum Names {
    ADAM,
    BOB,
    BRAYAN,
    ALICE,
    ANNA,
    CHARLIE,
    JOE,
    ROSS,
    CHANDLER,
    MONICA,
    PHOEBE,
    RACHEL,
    SAMUEL,
    DEAN,
    JOHN,
    DAWID,
    JENNIFER,
    MATT,
    MARTA,
    SAMANTHA;

    public static String getRandomName() {
        Names[] values = values();
        int randomNumber = RandomHelper.nextInt(values.length);
        return values[randomNumber].name();
    }
}
