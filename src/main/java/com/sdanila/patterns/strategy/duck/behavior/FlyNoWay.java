package com.sdanila.patterns.strategy.duck.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}
