package model;

import constants.Discount;

import static constants.Discount.NOTHING;

public abstract class Food implements Discountable {
    protected final int amount;
    protected final double price;
    protected final boolean isVegetarian;

    public boolean isVegetarian() {
        return isVegetarian;
    }
    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalCost(){
        return price * amount;
    }

    public double getTotalDiscountAmount() {
        if (getDiscount() == NOTHING) {
            return 0;
        }
        return getTotalCost() * getDiscount() / 100;
    }

    public double getTotalCostDiscounted() {
        return getTotalCost() - getTotalDiscountAmount();
    }
}
