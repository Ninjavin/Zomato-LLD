package com.ninjavin.zomato.models;

import com.ninjavin.zomato.utils.IdGenerator;

public class FoodItem {
    private Long id;
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.id = IdGenerator.generateId();
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
