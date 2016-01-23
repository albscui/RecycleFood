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


    public Person(String firstName, String lastName, String address, String cusine, Rating rating){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cuisine = cuisine;
        this.rating = rating;
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
