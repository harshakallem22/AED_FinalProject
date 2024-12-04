/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Customer.Customer;
import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class UserAccountDirectory {
    
    private ArrayList<EmployeeAccount> userAccountList;
    private ArrayList<CustomerAccount> customerList;
    private CustomerAccountDirectory cad;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
        customerList = new ArrayList<>();
        cad = new CustomerAccountDirectory();
    }

    public ArrayList<EmployeeAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public ArrayList<CustomerAccount> getCustomerList(){
        return customerList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (EmployeeAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        for(CustomerAccount ua : customerList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public EmployeeAccount createUserAccount(String username, String password, Role role){
        EmployeeAccount userAccount = new EmployeeAccount(username,password, role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
     public CustomerAccount createCustomerAccount(String username, String password, Role role){
        CustomerAccount userAccount = new CustomerAccount(username,password, role);
        customerList.add(userAccount);
        cad.getCustomerList().add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
