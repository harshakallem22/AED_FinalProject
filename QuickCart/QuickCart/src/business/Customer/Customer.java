/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Customer;

import business.UserAccount.EmployeeAccount;

/**
 *
 * @author SAI SRIDHAR
 */
public class Customer {
    private int id;
    private String email;
    private String name;
    private String phone;
    private String address;
    private static int counter = 1;
    
    public Customer(String name, String email, String phone, String address){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = counter;
        counter ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }

}
