/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.EcoSystem;

import business.Customer.Customer;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Enterprise.Enterprise.EnterpriseType;
import static business.Enterprise.Enterprise.EnterpriseType.Restaurant;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Role.CustomerRole;
import business.Role.RestaurantManagerRole;
import business.UserAccount.CustomerAccount;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;

/**
 *
 * @author SAI SRIDHAR
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Customer cus1 = system.getCustomerDirectory().createCustomer("Sridhar", "sridhar@gmail.com", "0987654321", "Boston");
        //Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        CustomerAccount ua1 = system.getUserAccountDirectory().createCustomerAccount("sridhar", "1234", new CustomerRole());
        System.out.println(system.getUserAccountDirectory().getUserAccountList().size());
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        //UserAccount labManager = system.getUserAccountDirectory().createUserAccount("labManager", "sysadmin", employee, new LabManagerRole());
        
        Network network = system.createAndAddNetwork();
        network.setName("QuickCart");
        
        RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "","","");
        //RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "", "", "");
        Employee emp1 = res1.getEmployeeDirectory().createEmployee("manager1");
        res1.getMenu().createFoodItem("Pannerr", 10.5);
        
        RestaurantEnterprise res2 = network.getEnterpriseDirectory().createRestaurant("uop", "","","");
        //RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "", "", "");
        Employee emp2 = res2.getEmployeeDirectory().createEmployee("manager1");
        res2.getMenu().createFoodItem("abc", 13);
        EmployeeAccount ua = system.getUserAccountDirectory().createUserAccount("man1", "man1", new RestaurantManagerRole());
        ua.setEmployee(emp2);
        System.out.println("System is "+system);
        return system;
    }
}
