package com.sdanila.patterns.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Rost Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
