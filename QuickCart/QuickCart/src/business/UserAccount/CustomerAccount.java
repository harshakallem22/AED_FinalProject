/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;

import business.Customer.Customer;


/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerAccount {
    
    private String username;
    private String password;
    private Customer customer;

    public CustomerAccount() {
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getEmployee() {
        return customer;
    }

    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}
