package com.mariiapasichna;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];

        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setWeightGram(152);
        lemon.setPricePerKg(41.90);
        System.out.println("Lemon price: " + lemon.getPrice());

        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 176, 27.00);
        System.out.println("Banana price: " + banana.getPrice());
        System.out.println("Banana color: " + banana.getColor());

        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 274, 14.90);
        System.out.println("Red apple price: " + redApple.getPrice());
        System.out.println("Red apple color: " + redApple.getColor());

        Fruit greenApple = new Fruit(FruitType.APPLE, Color.GREEN, 158, 16.90);
        System.out.println("Green apple price: " + greenApple.getPrice());
        System.out.println("Green apple color: " + greenApple.getColor());

        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = redApple;
        fruits[3] = greenApple;
        System.out.println(Arrays.toString(fruits));

        double total = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == null) {
                continue;
            }
            total += fruits[i].getPrice();
        }
        System.out.println("Total: " + total);
    }
}