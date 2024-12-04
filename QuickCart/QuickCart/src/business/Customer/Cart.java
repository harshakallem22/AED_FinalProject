/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Enterprise.RestaurantEnterprise;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class Cart {

    private ArrayList<ItemOrder> itemList;
    private double totalPrice;

    public Cart() {
        this.itemList = new ArrayList<>();
        BigDecimal bd = new BigDecimal(getTotalPrice());
        this.totalPrice = 0;
        this.totalPrice = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double getTotalPrice() {
        double total = 0;
        for (ItemOrder d : itemList) {
            total = totalPrice + d.getTotalPrice();
        }
        return total;
    }
    
    public void addToCart(ItemOrder order) {
        this.itemList.add(order);
    }
    
    public boolean isCartEmpty() {
        return itemList.isEmpty();
    }

    
    public ArrayList<ItemOrder> getItemList() {
    if (this.itemList == null) {
        this.itemList = new ArrayList<>();
    }
    return this.itemList;
}

public void clearCart() {
    if (this.itemList != null) {
        this.itemList.clear();
    } else {
        this.itemList = new ArrayList<>();
    }
}

    public void applyDiscountForNextOrders(int numOrders, int discountPercentage) {
    int count = 0;
    for (ItemOrder item : this.getItemList()) {
        if (count >= numOrders) break;
        double originalPrice = item.getTotalPrice();
        item.setTotalPrice(originalPrice * (1 - discountPercentage / 100.0)); 
        count++;
    }
}

}
