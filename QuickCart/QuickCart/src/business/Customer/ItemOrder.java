/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;


import business.Enterprise.Enterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Item.Item;
import java.math.BigDecimal;

/**
 *
 * @author SAI SRIDHAR
 */
public abstract class ItemOrder {
    private Item item;
    private int quantity;
    private double totalPrice;
    private Enterprise shopmodel;
    
    public ItemOrder(Enterprise shopmodel, Item item, int quantity) {
        this.shopmodel = shopmodel;
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return this.item;
    }

    public void setDash(Item item) {
        this.item = item;
    }

    public abstract Enterprise getShopModel();

    public void setOutler(Enterprise shopmodel) {
        this.shopmodel = shopmodel;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int q) {
        this.quantity = q;
        BigDecimal bd = new BigDecimal(item.getPrice() * q);
        this.totalPrice = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double getTotalPrice() {
        BigDecimal bd = new BigDecimal(item.getPrice() * quantity);
        this.totalPrice = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    @Override
    public String toString() {
        return this.item.getName();
    }
}
