package model;


import constants.Discount;

import java.util.Objects;

import static constants.Colour.COLOUR_RED;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(colour, COLOUR_RED)) {
            return Discount.SIXTY_PERCENT;
        }
        return Discount.NOTHING;
    }
}
