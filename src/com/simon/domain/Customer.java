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
        String result = " Rental Record for " + getName() + "\n";

        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrenquentRenterPoints()) + " frenquent renter points";
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            totalAmount += rental.getCharge();

        }
        return totalAmount;
    }

    private double getFrenquentRenterPoints() {
        double result = 0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getFrenquentRenterPoints();
        }
        return result;
    }

}
