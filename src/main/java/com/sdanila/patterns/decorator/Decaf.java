package com.sdanila.patterns.decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
