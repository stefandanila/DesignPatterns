package com.sdanila.patterns.factory.products;

import com.sdanila.patterns.factory.creators.ingredients.PizzaIngredientFactory;

//When we added ingredient factory this becomes
//The Abstract Factory Pattern provides an interface
//for creating families of related or dependent objects
//without specifying their concrete classes.
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
