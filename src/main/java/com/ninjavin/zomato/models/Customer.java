package com.ninjavin.zomato.models;

import com.ninjavin.zomato.utils.IdGenerator;

public class Customer {
    private Long customerId;
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.customerId = IdGenerator.generateId();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
