package com.ninjavin.zomato.models;

import java.util.List;

public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private Menu menu = null;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }



    public List<FoodItem> browseMenu() {
        return menu.getFoodItems();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }
}
