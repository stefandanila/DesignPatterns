package com.sdanila.patterns.strategy.duck;

import com.sdanila.patterns.strategy.duck.behavior.FlyWithWings;
import com.sdanila.patterns.strategy.duck.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
