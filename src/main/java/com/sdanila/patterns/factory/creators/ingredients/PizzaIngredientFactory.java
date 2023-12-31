package com.sdanila.patterns.factory.creators.ingredients;

import com.sdanila.patterns.factory.products.ingredients.cheese.Cheese;
import com.sdanila.patterns.factory.products.ingredients.clams.Clams;
import com.sdanila.patterns.factory.products.ingredients.dough.Dough;
import com.sdanila.patterns.factory.products.ingredients.sauce.Sauce;
import com.sdanila.patterns.factory.products.ingredients.vegie.Pepperoni;
import com.sdanila.patterns.factory.products.ingredients.vegie.Veggie;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
