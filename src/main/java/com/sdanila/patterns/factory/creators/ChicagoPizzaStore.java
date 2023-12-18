package com.sdanila.patterns.factory.creators;

import com.sdanila.patterns.factory.products.ChicagoStyleCheesePizza;
import com.sdanila.patterns.factory.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type))
        {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
