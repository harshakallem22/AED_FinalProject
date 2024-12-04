/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Item.Item;
import business.Enterprise.RestaurantEnterprise;
import java.math.BigDecimal;

/**
 *
 * @author SAI SRIDHAR
 */
public class FoodItemOrder extends ItemOrder {

    private RestaurantEnterprise restaurant;

    public FoodItemOrder(RestaurantEnterprise restaurant, Item item, int quantity) {
        super(restaurant, item, quantity);
        this.restaurant = restaurant;
    }

    public RestaurantEnterprise getRestaurant() {
        return  this.getShopModel();
    }

    @Override
    public RestaurantEnterprise getShopModel() {
        return this.restaurant;
    }
}
