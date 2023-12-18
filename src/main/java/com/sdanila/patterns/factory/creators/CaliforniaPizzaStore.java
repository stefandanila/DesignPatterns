package com.sdanila.patterns.factory.creators;

import com.sdanila.patterns.factory.products.CaliforniaStyleCheesePizza;
import com.sdanila.patterns.factory.products.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CaliforniaStyleCheesePizza();
        }
        return null;
    }
}
