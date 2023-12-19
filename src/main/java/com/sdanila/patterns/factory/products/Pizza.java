package com.sdanila.patterns.factory.products;

import com.sdanila.patterns.factory.products.ingredients.cheese.Cheese;
import com.sdanila.patterns.factory.products.ingredients.clams.Clams;
import com.sdanila.patterns.factory.products.ingredients.dough.Dough;
import com.sdanila.patterns.factory.products.ingredients.sauce.Sauce;
import com.sdanila.patterns.factory.products.ingredients.vegie.Pepperoni;
import com.sdanila.patterns.factory.products.ingredients.vegie.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
