/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Customer;

import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<>();
    }
    
    public Customer createCustomer(String name, String email, String phone, String address){
        Customer customer = new Customer(name, email, phone, address);
        customerList.add(customer);
        return customer;
    }
    
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    
}
