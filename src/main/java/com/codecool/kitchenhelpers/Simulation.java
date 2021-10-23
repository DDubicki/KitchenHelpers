package com.codecool.kitchenhelpers;

import java.util.Scanner;

public class Simulation {

    int COOKS_NUMBER = 3;
    int HELPERS_NUMBER = 7;
    private final Kitchen kitchen;

    public Simulation() {
        kitchen = new Kitchen(COOKS_NUMBER, HELPERS_NUMBER);
    }

    public void runKitchen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What we will do? We will cook fuc*** delicious food! Sit down and wait!\n");
        do {
            kitchen.cookFood();
        } while (!scanner.nextLine().equalsIgnoreCase("q"));
    }
}
