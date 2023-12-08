package com.sdanila.patterns.strategy;

import com.sdanila.patterns.strategy.behavior.FlyRocketPowered;

//The Strategy Pattern defines a family of algorithms,
//encapsulates each one, and makes them interchangeable.
//Strategy lets the algorithm vary independently of
//clients that use it.
public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Mallard duck");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("Model duck");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
