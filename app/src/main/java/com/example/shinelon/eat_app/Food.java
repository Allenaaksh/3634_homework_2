package com.example.shinelon.eat_app;

/**
 * Created by Shinelon on 17/10/2019.
 */

public class Food {


    private int foodID;

    private String foodName;

    private int price;

    private String FoodDesc;
    private int imageDrawableId;

    public Food(int foodID, String foodName, int price, String foodDesc, int imageDrawableId) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
        FoodDesc = foodDesc;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
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

    public String getFoodDesc() {
        return FoodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        FoodDesc = foodDesc;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }


}
