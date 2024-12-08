/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.EcoSystem;

import business.Customer.Customer;
//import business.DAO.CustomerDAO;
import business.DAO.CustomerDAO;
//import business.DAO.CustomerDAO;
import business.Employee.Employee;
import business.Enterprise.AnalyticsEnterprise;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.InventoryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Organization.AnalyticsManagerOrganization;
import business.Role.AnalyticsMemberRole;
import business.Role.CustomerRole;
import business.Role.DeliveryManagerRole;
import business.Role.DeliveryPersonRole;
import business.Role.InventoryManagerRole;
import business.Role.RestaurantAdminRole;
import business.Role.RestaurantCookRole;
import business.Role.RestaurantManagerRole;
import business.Role.StoreManagerRole;
import business.UserAccount.CustomerAccount;
import business.UserAccount.EmployeeAccount;
import java.util.ArrayList;

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
        
        Customer c = system.getCustomerDirectory().createCustomer("Sridhar", "sridhar@gmail.com", "1234", "Boston");
        CustomerAccount ua1 = system.getUserAccountDirectory().createCustomerAccount("sridhar", "1234", new CustomerRole());
        ua1.setCustomer(c);
        
//        ArrayList<CustomerAccount> customersFromDB = CustomerDAO.getAllCustomers();
//
//        for (CustomerAccount customer : customersFromDB) {
//            system.getCustomerDirectory().getCustomerList().add(customer.getCustomer());
//            system.getUserAccountDirectory().getCustomerList().add(customer);
//        }
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        //UserAccount labManager = system.getUserAccountDirectory().createUserAccount("labManager", "sysadmin", employee, new LabManagerRole());
        
        Network network = system.createAndAddNetwork();
        network.setName("QuickCart");
        
        RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "","","");
        //RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "", "", "");
        Employee emp1 = res1.getEmployeeDirectory().createEmployee("manager1", "check@gmail.com");
        res1.getMenu().createFoodItem("Pannerr", 10.5);
        
        
        RestaurantEnterprise res2 = network.getEnterpriseDirectory().createRestaurant("uop", "","","");
        //RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "", "", "");
        
        Employee emp2 = res2.getEmployeeDirectory().createEmployee("manager1", "check@gmail.com");
        res2.getMenu().createFoodItem("abc", 13);
        EmployeeAccount ua = system.getUserAccountDirectory().createUserAccount("man1", "man1", new RestaurantManagerRole());
        ua.setEmployee(emp2);
        
        Employee uopcook = res2.getEmployeeDirectory().createEmployee("cook", "check123@gmail.com");
        EmployeeAccount uopEa = system.getUserAccountDirectory().createUserAccount("cook", "cook", new RestaurantCookRole());
        uopEa.setEmployee(uopcook);
        
        DeliveryEnterprise del1 = network.getEnterpriseDirectory().createDelivery("del1", "", "", "");
        Employee delemp1 = del1.getEmployeeDirectory().createEmployee("delman", "check12@gmail.com");
        EmployeeAccount delea1 = system.getUserAccountDirectory().createUserAccount("delman1", "delman1", new DeliveryManagerRole());
        delea1.setEmployee(delemp1);
        
        Employee delper = del1.getEmployeeDirectory().createEmployee("delper", "check@gmail.com");
        EmployeeAccount delperEa = system.getUserAccountDirectory().createUserAccount("delper", "delper", new DeliveryPersonRole());
        delperEa.setEmployee(delper);
        
        
        GroceryEnterprise ge1 = network.getEnterpriseDirectory().createStore("ge1", "09876543", "Boston", "ge1@gmail.com");
        Employee geemp1 = ge1.getEmployeeDirectory().createEmployee("geemp", "check@gmail.com");
        EmployeeAccount geea = system.getUserAccountDirectory().createUserAccount("geman", "geman", new StoreManagerRole());
        geea.setEmployee(geemp1);
        ge1.getGroceryCatalog().createGroceryItem("Soap", 4, 100);
        ge1.getGroceryCatalog().createGroceryItem("Brush", 5, 4);
        
        InventoryEnterprise inv1 = network.getEnterpriseDirectory().createInventory("inv1", "kjsdb", "abcd", "bcd@gmail.com");
        Employee invemp1 = inv1.getEmployeeDirectory().createEmployee("invman", "check@gmail.com");
        EmployeeAccount invea1 = system.getUserAccountDirectory().createUserAccount("invman1", "invman1", new InventoryManagerRole());
        invea1.setEmployee(invemp1);
        
//        AnalyticsEnterprise ana1 = network.getEnterpriseDirectory().createAnalytics("inv1", "kjsdb", "abcd", "bcd@gmail.com");
////        Employee anaemp1 = ana1.getEmployeeDirectory().createEmployee("anaman");
//        AnalyticsManagerOrganization amo = new AnalyticsManagerOrganization();
//        Employee anaemp1 = amo.getEmployeeDirectory().createEmployee("anaman");
//        EmployeeAccount anaea = amo.getUserAccountDirectory().createUserAccount("anaman", "anaman", new AnalyticsMemberRole());
//        anaea.setEmployee(anaemp1);

          AnalyticsEnterprise ana1 = network.getEnterpriseDirectory().createAnalytics("inv1", "kjsdb", "abcd", "bcd@gmail.com");
          Employee anaemp1 = ana1.getEmployeeDirectory().createEmployee("anaman", "check@gmail.com");
          EmployeeAccount anaea = system.getUserAccountDirectory().createUserAccount("anaman", "anaman", new AnalyticsMemberRole());
          anaea.setEmployee(anaemp1);
          
          Employee ra1 = system.getEmployeeDirectory().createEmployee("ra1", "ra1@gmail.com");
          EmployeeAccount ea123 = system.getUserAccountDirectory().createUserAccount("ra1", "ra1", new RestaurantAdminRole());
          ea123.setEmployee(ra1);
        
        return system;
    }
}
