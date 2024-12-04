/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;

import business.Customer.Cart;
import business.Customer.Customer;
import business.Role.Role;


/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerAccount extends UserAccount{
    
    private Customer customer;
    private Cart cart;

    public CustomerAccount(String username, String password, Role role) {
        super(username, password, role);
        cart = new Cart();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public Cart getCart(){
        return cart;
    }

    
    @Override
    public String toString() {
        return super.getUsername();
    }
    
    
    
}
