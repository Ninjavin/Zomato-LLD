package com.ninjavin.zomato.models;

import com.ninjavin.zomato.utils.IdGenerator;

import java.util.List;

public class Menu {
    private Long id;
    private List<FoodItem> foodItems;
    public Menu() {
        this.id = IdGenerator.generateId();
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", foodItems=" + foodItems +
                '}';
    }
}
