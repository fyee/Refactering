package com.simon.modal;

/**
 * Created by Simon on 2/21/16.
 */
public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    public int getFrenquentRenterPoints(int daysRented){
        return 1;
    }
}
