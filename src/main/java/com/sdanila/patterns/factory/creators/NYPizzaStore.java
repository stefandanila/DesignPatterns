package com.sdanila.patterns.factory.creators;

import com.sdanila.patterns.factory.creators.ingredients.NYPizzaIngredientFactory;
import com.sdanila.patterns.factory.creators.ingredients.PizzaIngredientFactory;
import com.sdanila.patterns.factory.products.CheesePizza;
import com.sdanila.patterns.factory.products.ClamPizza;
import com.sdanila.patterns.factory.products.Pizza;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
