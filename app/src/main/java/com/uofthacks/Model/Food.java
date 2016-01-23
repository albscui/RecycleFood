package com.uofthacks.Model;

/**
 * Created by mlh-admin on 1/23/16.
 */
public class Food {

    //private
    private String[] ingredients;
    private String cuisine;
    private String[] potentialAllergies;
    private int portionsAvailable;
    private double selling;

    public Food(String[] ingredients, String cuisine, String[] potentialAllergies, int portionsAvailable, double selling){

        this.ingredients =  ingredients;
        this.cuisine = cuisine;
        this.portionsAvailable = portionsAvailable;
        this.portionsAvailable = portionsAvailable;
        this.selling = selling;

    }

    public double getSelling() {
        return selling;
    }

    public void setSelling(double selling) {
        this.selling = selling;
    }

    public int getPortionsAvailable() {

        return portionsAvailable;
    }

    public void setPortionsAvailable(int portionsAvailable) {
        this.portionsAvailable = portionsAvailable;
    }

    public String[] getPotentialAllergies() {

        return potentialAllergies;
    }

    public void setPotentialAllergies(String[] potentialAllergies) {
        this.potentialAllergies = potentialAllergies;
    }

    public String getCuisine() {

        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String[] getIngredients() {

        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
