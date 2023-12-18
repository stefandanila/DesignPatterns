package com.sdanila.patterns.factory;

import com.sdanila.patterns.factory.creators.CaliforniaPizzaStore;
import com.sdanila.patterns.factory.creators.ChicagoPizzaStore;
import com.sdanila.patterns.factory.creators.NYPizzaStore;
import com.sdanila.patterns.factory.creators.PizzaStore;
import com.sdanila.patterns.factory.products.Pizza;

//The Factory Method Pattern defines an interface
//for creating an object, but lets subclasses decide which
//class to instantiate. Factory Method lets a class defer
//instantiation to subclasses.
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "  + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        PizzaStore californiaStore = new CaliforniaPizzaStore();
        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Joe ordered a " + pizza.getName() + "\n");
    }
}
