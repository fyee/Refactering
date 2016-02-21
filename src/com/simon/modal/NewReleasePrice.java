package com.simon.modal;

import com.simon.domain.Movie;

/**
 * Created by Simon on 2/21/16.
 */
public class NewReleasePrice extends  Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public int getFrenquentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : super.getFrenquentRenterPoints(daysRented);
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
