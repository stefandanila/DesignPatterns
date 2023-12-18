package com.sdanila.patterns.factory.creators;

import com.sdanila.patterns.factory.products.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //the factory method
    abstract Pizza createPizza(String type);
}
