package com.sdanila.oop.duck;

import com.sdanila.oop.duck.behavior.FlyWithWings;
import com.sdanila.oop.duck.behavior.Quack;

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
