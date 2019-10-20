package com.example.shinelon.eat_app;

public class addFood {


    private String foodName;

    private int price;

    private int image;
    private int numberselected;

    public addFood(String foodName, int price, int numberselected, int image) {
        this.foodName = foodName;
        this.price = price;
        this.numberselected = numberselected;
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberselected() {
        return numberselected;
    }

    public void setNumberselected(int numberselected) {
        this.numberselected = numberselected;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
