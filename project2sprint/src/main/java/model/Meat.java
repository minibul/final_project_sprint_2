package model;

import static constants.Discount.NOTHING;

public class Meat extends Food {
    public Meat(int amount, double price, boolean isVegetarian) {
        super(amount, price, isVegetarian);
    }

    @Override
    public double getDiscount() {
        return NOTHING;
    }
}
