package com.sdanila.patterns.factory.creators.ingredients;

import com.sdanila.patterns.factory.products.ingredients.cheese.Cheese;
import com.sdanila.patterns.factory.products.ingredients.cheese.Mozzarella;
import com.sdanila.patterns.factory.products.ingredients.clams.Clams;
import com.sdanila.patterns.factory.products.ingredients.clams.FrozenClams;
import com.sdanila.patterns.factory.products.ingredients.dough.Dough;
import com.sdanila.patterns.factory.products.ingredients.dough.ThickCrustDough;
import com.sdanila.patterns.factory.products.ingredients.sauce.PlumTomatoSauce;
import com.sdanila.patterns.factory.products.ingredients.sauce.Sauce;
import com.sdanila.patterns.factory.products.ingredients.vegie.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    public Cheese createCheese() {
        return new Mozzarella();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FrozenClams();
    }
}
