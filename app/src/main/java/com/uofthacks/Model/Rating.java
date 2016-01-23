package com.uofthacks.Model;

/**
 * Created by mlh-admin on 1/22/16.
 */
public class Rating {

    private int personalRating;
    private double sales;

    public Rating(int personalRating, double sales){
        this.personalRating = personalRating;
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public int getPersonalRating() {

        return personalRating;
    }

    public void setPersonalRating(int personalRating) {
        this.personalRating = personalRating;
    }
}
