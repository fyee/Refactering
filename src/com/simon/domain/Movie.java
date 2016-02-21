package com.simon.domain;

import com.simon.modal.ChildrensPrice;
import com.simon.modal.NewReleasePrice;
import com.simon.modal.Price;
import com.simon.modal.RegularPrice;

/**
 * Created by Simon on 2/21/16.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
       // this._priceCode = priceCode;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode){
            case Movie.REGULAR:
                _price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case Movie.CHILDRENS:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException(" Incorrect Price Code");
        }
    }

    public String getTitle() {
        return this._title;
    }

    public  double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }

    public int getFrenquentRenterPoints(int daysRented) {
        return _price.getFrenquentRenterPoints(daysRented);
    }
}
