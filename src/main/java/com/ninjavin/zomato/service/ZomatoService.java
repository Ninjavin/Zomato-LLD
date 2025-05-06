package com.ninjavin.zomato.service;

import com.ninjavin.zomato.models.*;

import java.util.ArrayList;
import java.util.List;

public class ZomatoService {
    private static ZomatoService instance;
    private final List<Restaurant> restaurants;
    private final List<Customer> customers;
    private final List<DeliveryAgent> deliveryAgents;
    private final List<Order> orders;

    private ZomatoService() {
        customers = new ArrayList<>();
        restaurants = new ArrayList<>();
        deliveryAgents = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public static synchronized ZomatoService getInstance() {
        if (instance == null) {
            instance = new ZomatoService();
        }
        return instance;
    }

    public Customer registerCustomer(String name, String address) {
        Customer customer = new Customer(name, address);
        customers.add(customer);
        return customer;
    }

    public Restaurant registerRestaurant(String name, String address) {
        Restaurant restaurant = new Restaurant(name, address);
        restaurants.add(restaurant);
        return restaurant;
    }

    public DeliveryAgent registerDeliveryAgent(String name) {
        DeliveryAgent agent = new DeliveryAgent(name);
        deliveryAgents.add(agent);
        return agent;
    }

    public List<String> getAvailableRestaurants() {
        List<String> restaurantNames = new ArrayList<>();
        for (Restaurant restaurant: restaurants) {
            restaurantNames.add(restaurant.getName());
        }
        return restaurantNames;
    }

    public Menu getRestaurantMenuByName(String restaurantName) {
        List<String> restaurantMenu = new ArrayList<>();
        Restaurant r = null;
        for (Restaurant restaurant: restaurants) {
            if (restaurant.getName() == restaurantName) {
                return restaurant.getMenu();
            }
        }
        return null;
    }
}
