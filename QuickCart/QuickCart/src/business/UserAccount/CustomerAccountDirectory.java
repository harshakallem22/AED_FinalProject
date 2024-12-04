/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;

import business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerAccountDirectory {
    private ArrayList<CustomerAccount> customerList;
    
    public CustomerAccountDirectory(){
        customerList = new ArrayList<>();
    }
    
//     public CustomerAccount createCustomerAccount(String username, String password, Customer customer){
//        CustomerAccount customerAccount = new CustomerAccount();
//        customerAccount.setCustomer(customer);
//        customerAccount.setUsername(username);
//        customerAccount.setPassword(password);
//        customerList.add(customerAccount);
//        return customerAccount;
//    }

    public ArrayList<CustomerAccount> getCustomerList() {
        return customerList;
    }
    
    
    
}
