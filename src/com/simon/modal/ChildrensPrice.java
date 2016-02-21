package com.simon.modal;

import com.simon.domain.Movie;

/**
 * Created by Simon on 2/21/16.
 */
public class ChildrensPrice extends  Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result =  1.5;
        if (daysRented > 3) {
            result +=  (daysRented - 3) * 1.5;
        }
        return result;
    }
}
