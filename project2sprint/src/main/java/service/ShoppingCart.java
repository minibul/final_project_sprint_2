package service;

import model.Food;

public class ShoppingCart {

    private final Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : food) {
            total += item.getTotalCost();
        }
        return total;
    }

    public double getTotalPriceDiscounted() {
        double totalDiscounted = 0;
        for (Food item : food) {
            totalDiscounted += item.getTotalDiscountAmount();
        }
        return totalDiscounted;
    }

    public double getTotalPriceVegetarianFood() {
        double vegetarianFood = 0;
        for (Food item : food) {
            if (item.isVegetarian()) {
                vegetarianFood += item.getTotalCostDiscounted();
            }
        }
        return vegetarianFood;
    }
}
