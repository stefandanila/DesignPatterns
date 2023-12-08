package com.sdanila.patterns.strategy;

import com.sdanila.patterns.strategy.behavior.FlyNoWay;
import com.sdanila.patterns.strategy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
