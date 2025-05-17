package com.ninjavin.zomato.models;

import com.ninjavin.zomato.enums.DeliveryAgentStatus;
import com.ninjavin.zomato.enums.OrderStatus;
import com.ninjavin.zomato.utils.IdGenerator;

import java.util.List;

public class Order {
    private Long orderId;
    private Restaurant restaurant;
    private Long agentId = null;
    private Customer customer;
    private List<FoodItem> foodItems;
    private double amount;
    private OrderStatus orderStatus = OrderStatus.ORDER_PLACED;

    public Order(Restaurant restaurant, Long agentId, Customer customer, List<FoodItem> foodItems) {
        this.orderId = IdGenerator.generateId();
        this.restaurant = restaurant;
        this.agentId = agentId;
        this.customer = customer;
        this.foodItems = foodItems;
        setAmount();
    }

    public void setAmount() {
        double a = 0;
        for (FoodItem foodItem : foodItems) {
            a += foodItem.getPrice();
        }
        this.amount = a;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", restaurant=" + restaurant +
                ", agentId=" + agentId +
                ", customer=" + customer +
                ", foodItems=" + foodItems +
                ", amount=" + amount +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
