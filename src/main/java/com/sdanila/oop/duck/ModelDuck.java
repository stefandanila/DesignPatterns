package com.sdanila.oop.duck;

import com.sdanila.oop.duck.behavior.FlyNoWay;
import com.sdanila.oop.duck.behavior.Quack;

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
