package com.sdanila.patterns.factory.creators;

import com.sdanila.patterns.factory.products.NYStyleCheesePizza;
import com.sdanila.patterns.factory.products.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type))
        {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
