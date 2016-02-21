package com.simon.domain;

/**
 * Created by Simon on 2/21/16.
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie getMovie() {
        return this._movie;
    }

    public int getDaysRented() {
        return this._daysRented;
    }

    public  double getCharge(){
        return  _movie.getCharge(_daysRented);
    }

    /**
     * calculate frenquete renter point
     * @return int
     */
    public int getFrenquentRenterPoints() {
       return _movie.getFrenquentRenterPoints(_daysRented);
    }
}
