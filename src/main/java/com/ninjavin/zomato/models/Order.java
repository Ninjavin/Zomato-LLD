package com.ninjavin.zomato.models;

import com.ninjavin.zomato.enums.DeliveryAgentStatus;
import com.ninjavin.zomato.enums.OrderStatus;

import java.util.List;

public class Order {
    private Long orderId;
    private Restaurant restaurant;
    private DeliveryAgentStatus agentId = null;
    private Customer customer;
    private List<FoodItem> foodItems;
    private double amount;
    private OrderStatus orderStatus;
}
