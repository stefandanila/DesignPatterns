package com.sdanila.patterns.factory.creators;

import com.sdanila.patterns.factory.creators.ingredients.ChicagoPizzaIngredientFactory;
import com.sdanila.patterns.factory.creators.ingredients.PizzaIngredientFactory;
import com.sdanila.patterns.factory.products.CheesePizza;
import com.sdanila.patterns.factory.products.ClamPizza;
import com.sdanila.patterns.factory.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
