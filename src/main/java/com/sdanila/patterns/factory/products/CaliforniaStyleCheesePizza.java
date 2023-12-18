package com.sdanila.patterns.factory.products;

public class CaliforniaStyleCheesePizza extends Pizza{
    public CaliforniaStyleCheesePizza() {
        name = "California Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Sauce";
        toppings.add("Corn");
        toppings.add("Pineapple");
    }
}
