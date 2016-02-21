package com.simon.domain;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Simon on 2/21/16.
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental rental) {
        this._rentals.add(rental);
    }

    public String getName() {
        return this._name;
    }

    public String statement() {
        double totalAmount = 0;
        int frenquentRenterPoints = 0;
        Enumeration rentals = this._rentals.elements();
        String result = " Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;

            Rental rental = (Rental) rentals.nextElement();
            frenquentRenterPoints = getFrenquentRenterPoints(frenquentRenterPoints, rental);
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.amountFor()) + "\n";
            totalAmount += rental.amountFor();
        }

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frenquentRenterPoints) + " frenquent renter points";
        return result;
    }

    /**
     * calculate frenquete renter point 
     * @param frenquentRenterPoints
     * @param rental
     * @return
     */
    public int getFrenquentRenterPoints(int frenquentRenterPoints, Rental rental) {
        frenquentRenterPoints++;
        if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
            frenquentRenterPoints++;
        }
        return frenquentRenterPoints;
    }


}
