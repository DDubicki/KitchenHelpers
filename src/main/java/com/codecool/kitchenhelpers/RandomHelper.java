package com.codecool.kitchenhelpers;

import java.util.Random;

public class RandomHelper {

    public static Random INSTANCE = new Random();

    public static int nextInt(int bound) {
        return INSTANCE.nextInt(bound);
    }

    public static int nextInt(int lowerBound, int upperBound) {
        return INSTANCE.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static boolean getRandomBoolean() {
        return INSTANCE.nextBoolean();
    }

}
