package com.mariiapasichna;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fruit {
    private FruitType type;
    private Color color;
    private int weightGram;
    private double pricePerKg;

    public Fruit() {
    }

    public Fruit(FruitType type, Color color, int weightGram, double pricePerKg) {
        this.type = type;
        this.color = color;
        this.weightGram = weightGram;
        this.pricePerKg = pricePerKg;
    }

    public Fruit(int weightGram, double pricePerKg) {
        this.weightGram = weightGram;
        this.pricePerKg = pricePerKg;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        double price = pricePerKg * weightGram / 1000;
        price = new BigDecimal(price).setScale(2, RoundingMode.UP).doubleValue();
        return price;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeightGram(int weightGram) {
        this.weightGram = weightGram;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weightGram=" + weightGram +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}