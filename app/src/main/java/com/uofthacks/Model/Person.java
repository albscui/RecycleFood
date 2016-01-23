package com.uofthacks.Model;

/**
 * Created by mlh-admin on 1/22/16.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String cuisine;
    private Rating rating;
    private double balance;

    public Person(){};

    public Person(String firstName, String lastName, String address, String cuisine, Rating rating, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cuisine = cuisine;
        this.rating = rating;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getCuisine() {

        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
