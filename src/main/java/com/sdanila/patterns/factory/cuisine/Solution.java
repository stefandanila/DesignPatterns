//this problem was asked during oracle interview for senior java
package com.sdanila.patterns.factory.cuisine;

import java.util.*;

abstract class Cuisine {
    public abstract Cuisine serveFood(String dish);
}

class UnservableCuisineRequestException extends Exception {
    public UnservableCuisineRequestException(String message) {
        super(message);
    }
}


/*
 * Create the FoodFactory class and other required classes here.
 */

class FoodFactory {
    private static Map<String, Cuisine> cuisines =  new HashMap<>();
    private static FoodFactory foodFactory;
    public static FoodFactory getFactory() {
        if(foodFactory == null){
            foodFactory = new FoodFactory();
        }
        return foodFactory;
    }

    public void registerCuisine(String type, Cuisine cuisine ) {
        cuisines.put(type, cuisine);
    }

    public Cuisine serveCuisine(String cuisineKey, String dish) throws UnservableCuisineRequestException {
        if(cuisines.get(cuisineKey) == null) {
            String msg  = ("Unservable cuisine " +  cuisineKey + " for dish " + dish);
            throw new UnservableCuisineRequestException(msg);
        }
        return cuisines.get(cuisineKey).serveFood(dish);
    }

}

class Chinese  extends Cuisine {
    private String dish;
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    public String getDish() {
        return dish;
    }
}

class Italian  extends Cuisine {
    private String dish;
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    public String getDish() {
        return dish;
    }
}

class Japanese  extends Cuisine {
    private String dish;
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    public String getDish() {
        return dish;
    }
}

class Mexican  extends Cuisine {
    private String dish;
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    public String getDish() {
        return dish;
    }
}


public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    private static final FoodFactory FOOD_FACTORY = FoodFactory.getFactory();

    static {
        FoodFactory.getFactory().registerCuisine("Chinese", new Chinese());
        FoodFactory.getFactory().registerCuisine("Italian", new Italian());
        FoodFactory.getFactory().registerCuisine("Japanese", new Japanese());
        FoodFactory.getFactory().registerCuisine("Mexican", new Mexican());
    }

    public static void main(String[] args) {
        int totalNumberOfOrders = Integer.parseInt(INPUT_READER.nextLine());
        while (totalNumberOfOrders-- > 0) {
            String[] food = INPUT_READER.nextLine().split(" ");
            String cuisine = food[0];
            String dish = food[1];

            try {
                if (FOOD_FACTORY.equals(FoodFactory.getFactory())) {
                    Cuisine servedFood = FOOD_FACTORY.serveCuisine(cuisine, dish);

                    switch (cuisine) {
                        case "Chinese":
                            Chinese chineseDish = (Chinese) servedFood;
                            System.out.println("Serving " + chineseDish.getDish() + "(Chinese)");
                            break;
                        case "Italian":
                            Italian italianDish = (Italian) servedFood;
                            System.out.println("Serving " + italianDish.getDish() + "(Italian)");
                            break;
                        case "Japanese":
                            Japanese japaneseDish = (Japanese) servedFood;
                            System.out.println("Serving " + japaneseDish.getDish() + "(Japanese)");
                            break;
                        case "Mexican":
                            Mexican mexicanDish = (Mexican) servedFood;
                            System.out.println("Serving " + mexicanDish.getDish() + "(Mexican)");
                            break;
                        default:
                            break;
                    }
                }
            } catch (UnservableCuisineRequestException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}