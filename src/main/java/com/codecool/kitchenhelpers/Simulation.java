package com.codecool.kitchenhelpers;

import com.codecool.kitchenhelpers.employees.HRDepartment;

import java.util.Scanner;

public class Simulation {

    int COOKS_NUMBER = 3;
    int HELPERS_NUMBER = 3;
    private final Kitchen kitchen;

    public Simulation() {
        HRDepartment hrDepartment = new HRDepartment(COOKS_NUMBER, HELPERS_NUMBER);
        kitchen = new Kitchen(hrDepartment.getChef(), hrDepartment.getCooks(), hrDepartment.getKitchenHelpers());
    }

    public void runKitchen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What we will do? We will cook fuc*** delicious food! Sit down and wait!\n");
        do {
            kitchen.cookFood();
        } while (!scanner.nextLine().equalsIgnoreCase("q"));
    }
}
