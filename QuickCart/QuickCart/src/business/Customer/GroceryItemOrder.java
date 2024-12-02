/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Customer;

import business.Enterprise.GroceryEnterprise;
import business.Item.Item;

/**
 *
 * @author SAI SRIDHAR
 */
public class GroceryItemOrder extends ItemOrder{

    private GroceryEnterprise grocery;

    public GroceryItemOrder(GroceryEnterprise grocery, Item item, int quantity) {
        super(grocery, item, quantity);
        this.grocery = grocery;
    }
    @Override
    public GroceryEnterprise getShopModel() {
        return this.grocery;
    }
    
}
