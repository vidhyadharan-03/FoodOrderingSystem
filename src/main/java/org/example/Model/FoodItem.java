package org.example.Model;

public class FoodItem {
    private String foodName;
    private int foodId;
    private double price;
    private long likes;

    public FoodItem()
    {
        this.foodName=null;
        this.foodId=0;
        this.price=0.0;
        this.likes=0;
        //this.items=null;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodId() {
        return foodId;
    }

    public double getPrice() {
        return price;
    }

    public long getLikes() {
        return likes;
    }




}
