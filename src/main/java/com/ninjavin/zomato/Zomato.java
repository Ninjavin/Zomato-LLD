package com.ninjavin.zomato;

import com.ninjavin.zomato.models.Customer;
import com.ninjavin.zomato.models.Menu;
import com.ninjavin.zomato.models.Restaurant;
import com.ninjavin.zomato.service.ZomatoService;

public class Zomato {
    ZomatoService zomatoService = ZomatoService.getInstance();

    Customer customer = zomatoService.registerCustomer("Vineeta", "Bangur Avenue");
    Restaurant restaurant1 = zomatoService.registerRestaurant("Fly Kouzina", "Saltlake");
    Menu menu1 = new Menu();
    menu1.
}
