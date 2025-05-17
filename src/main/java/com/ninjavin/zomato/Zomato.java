package com.ninjavin.zomato;

import com.ninjavin.zomato.models.*;
import com.ninjavin.zomato.service.ZomatoService;

import java.util.ArrayList;
import java.util.List;

public class Zomato {
    public static void main(String[] args) {
        ZomatoService zomatoService = ZomatoService.getInstance();
        Customer customer = zomatoService.registerCustomer("Vineeta", "Bangur Avenue");
        Restaurant restaurant1 = zomatoService.registerRestaurant("Fly Kouzina", "Saltlake");
        Menu menu1 = new Menu();
        FoodItem foodItem1 = new FoodItem("Cold Coffee", 139.00);
        FoodItem foodItem2 = new FoodItem("Cheese Sandwich", 349.00);
        FoodItem foodItem3 = new FoodItem("Slider", 245.00);
        List<FoodItem> foodItemList = new ArrayList<>();
        foodItemList.add(foodItem1);
        foodItemList.add(foodItem2);
        foodItemList.add(foodItem3);
        menu1.setFoodItems(foodItemList);

        System.out.println(menu1.toString());

        restaurant1.setMenu(menu1);
        System.out.println(restaurant1.toString());
        System.out.println(customer.toString());

        DeliveryAgent deliveryAgent = new DeliveryAgent("Ram");

        List<FoodItem> orderedFoodItems = new ArrayList<>();
        orderedFoodItems.add(foodItem1);
        orderedFoodItems.add(foodItem3);
        Order order = new Order(restaurant1, deliveryAgent.getAgentId(), customer, orderedFoodItems);
        System.out.println(order.toString());
    }
}
