package com.sdanila.patterns.factory.creators.ingredients;

import com.sdanila.patterns.factory.products.ingredients.cheese.Cheese;
import com.sdanila.patterns.factory.products.ingredients.cheese.ReggianoCheese;
import com.sdanila.patterns.factory.products.ingredients.clams.Clams;
import com.sdanila.patterns.factory.products.ingredients.clams.FreshClams;
import com.sdanila.patterns.factory.products.ingredients.dough.Dough;
import com.sdanila.patterns.factory.products.ingredients.dough.ThinCrustDough;
import com.sdanila.patterns.factory.products.ingredients.sauce.MarinaraSauce;
import com.sdanila.patterns.factory.products.ingredients.sauce.Sauce;
import com.sdanila.patterns.factory.products.ingredients.vegie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FreshClams();
    }
}
