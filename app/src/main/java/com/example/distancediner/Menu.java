package com.example.distancediner;

public class Menu {

    String meal;
    String description;
    String price;


    public Menu(String meal, String description, String price) {
        this.meal = meal;
        this.description = description;
        this.price = price;

    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
