package com.sdanila.patterns.strategy.duck.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
