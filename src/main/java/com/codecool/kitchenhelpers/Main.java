package com.codecool.kitchenhelpers;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon", LocalDate.of(1985, 10, 25), 1000.0);
        System.out.println(chef);


    }
}
