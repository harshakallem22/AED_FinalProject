/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.EcoSystem;

import business.Customer.Customer;
//import business.DAO.CustomerDAO;
//import business.DAO.CustomerDAO;
//import business.DAO.CustomerDAO;
import business.Employee.Employee;
import business.Enterprise.AnalyticsEnterprise;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.InventoryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.FakerMockData.MockOrderGeneration;
import business.Network.Network;
import business.Organization.AnalyticsManagerOrganization;
import business.Role.AnalyticsMemberRole;
import business.Role.CustomerRole;
import business.Role.DeliveryAdminRole;
import business.Role.DeliveryManagerRole;
import business.Role.DeliveryPersonRole;
import business.Role.InventoryManagerRole;
import business.Role.RestaurantAdminRole;
import business.Role.RestaurantCookRole;
import business.Role.RestaurantManagerRole;
import business.Role.StoreAdminRole;
import business.Role.StoreManagerRole;
import business.UserAccount.CustomerAccount;
import business.UserAccount.EmployeeAccount;
import business.WorkQueue.OrderRequest;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Customer c = system.getCustomerDirectory().createCustomer("Sridhar", "saisridharparimi@gmail.com", "0987654321", "Boston, Mass");
        CustomerAccount ua1 = system.getUserAccountDirectory().createCustomerAccount("sridhar", "Quick@123", new CustomerRole());
        ua1.setCustomer(c);

        Customer c2 = system.getCustomerDirectory().createCustomer("Harsha", "k.harshavardhanreddy451@gmail.com", "9876543210", "Cambridge, Mass");
        CustomerAccount ua2 = system.getUserAccountDirectory().createCustomerAccount("harsha", "Harsha@321", new CustomerRole());
        ua2.setCustomer(c2);

        Customer c3 = system.getCustomerDirectory().createCustomer("Rhitik", "rhitikreddy25@gmail.com", "9123456789", "Somerville, Mass");
        CustomerAccount ua3 = system.getUserAccountDirectory().createCustomerAccount("rhitik", "Rhitik@123", new CustomerRole());
        ua3.setCustomer(c3);

        Network network = system.createAndAddNetwork();
        network.setName("QuickCart");

        // Restaurant 1
        RestaurantEnterprise res1 = network.getEnterpriseDirectory().createRestaurant("Vaanga", "123 Main St, Boston, MA", "0987654321", "vaanga@gmail.com");
        Employee emp1 = res1.getEmployeeDirectory().createEmployee("Manager1", "manager1@gmail.com");
        res1.getMenu().createFoodItem("Paneer Butter Masala", 12.5);
        res1.getMenu().createFoodItem("Masala Dosa", 8.5);
        res1.getMenu().createFoodItem("Idli Sambar", 6.5);
        res1.getMenu().createFoodItem("Vada Pav", 7.0);
        res1.getMenu().createFoodItem("Mango Lassi", 5.0);

// Restaurant 2
        RestaurantEnterprise res2 = network.getEnterpriseDirectory().createRestaurant("The Spice Lounge", "456 Oak St, Cambridge, MA", "9876543210", "spicelounge@gmail.com");
        Employee emp2 = res2.getEmployeeDirectory().createEmployee("Manager2", "manager2@gmail.com");
        res2.getMenu().createFoodItem("Chicken Tikka Masala", 14.0);
        res2.getMenu().createFoodItem("Garlic Naan", 4.5);
        res2.getMenu().createFoodItem("Biryani", 12.0);
        res2.getMenu().createFoodItem("Tandoori Roti", 3.5);
        res2.getMenu().createFoodItem("Rasgulla", 5.0);

// Restaurant 3
        RestaurantEnterprise res3 = network.getEnterpriseDirectory().createRestaurant("Curry Delight", "789 Elm St, Somerville, MA", "9012345678", "currydelight@gmail.com");
        Employee emp3 = res3.getEmployeeDirectory().createEmployee("Manager3", "manager3@gmail.com");
        res3.getMenu().createFoodItem("Butter Chicken", 13.0);
        res3.getMenu().createFoodItem("Aloo Paratha", 7.5);
        res3.getMenu().createFoodItem("Chole Bhature", 10.0);
        res3.getMenu().createFoodItem("Dal Makhani", 11.0);
        res3.getMenu().createFoodItem("Gulab Jamun", 5.5);

        // Restaurant 1 Manager
        Employee res1Manager = res1.getEmployeeDirectory().createEmployee("VaangaManager", "vaanga.manager@gmail.com");
        EmployeeAccount res1ManagerAccount = system.getUserAccountDirectory().createUserAccount("VaangaManager", "Vaanga123", new RestaurantManagerRole());
        res1ManagerAccount.setEmployee(res1Manager);

// Restaurant 2 Manager
        Employee res2Manager = res2.getEmployeeDirectory().createEmployee("SpiceLoungeManager", "spicelounge.manager@gmail.com");
        EmployeeAccount res2ManagerAccount = system.getUserAccountDirectory().createUserAccount("SpiceLoungeManager", "SpiceLounge123", new RestaurantManagerRole());
        res2ManagerAccount.setEmployee(res2Manager);

// Restaurant 3 Manager
        Employee res3Manager = res3.getEmployeeDirectory().createEmployee("CurryDelightManager", "currydelight.manager@gmail.com");
        EmployeeAccount res3ManagerAccount = system.getUserAccountDirectory().createUserAccount("CurryDelightManager", "CurryDelight123", new RestaurantManagerRole());
        res3ManagerAccount.setEmployee(res3Manager);

        // Cooks for Restaurant 1
        Employee cook1Res1 = res1.getEmployeeDirectory().createEmployee("Cook1Res1", "cook1res1@gmail.com");
        EmployeeAccount eaCook1Res1 = system.getUserAccountDirectory().createUserAccount("cook1res1", "Cook@123", new RestaurantCookRole());
        eaCook1Res1.setEmployee(cook1Res1);

        Employee cook2Res1 = res1.getEmployeeDirectory().createEmployee("Cook2Res1", "cook2res1@gmail.com");
        EmployeeAccount eaCook2Res1 = system.getUserAccountDirectory().createUserAccount("cook2res1", "Cook@456", new RestaurantCookRole());
        eaCook2Res1.setEmployee(cook2Res1);

// Cooks for Restaurant 2
        Employee cook1Res2 = res2.getEmployeeDirectory().createEmployee("Cook1Res2", "cook1res2@gmail.com");
        EmployeeAccount eaCook1Res2 = system.getUserAccountDirectory().createUserAccount("cook1res2", "Cook@789", new RestaurantCookRole());
        eaCook1Res2.setEmployee(cook1Res2);

        Employee cook2Res2 = res2.getEmployeeDirectory().createEmployee("Cook2Res2", "cook2res2@gmail.com");
        EmployeeAccount eaCook2Res2 = system.getUserAccountDirectory().createUserAccount("cook2res2", "Cook@012", new RestaurantCookRole());
        eaCook2Res2.setEmployee(cook2Res2);

// Cooks for Restaurant 3
        Employee cook1Res3 = res3.getEmployeeDirectory().createEmployee("Cook1Res3", "cook1res3@gmail.com");
        EmployeeAccount eaCook1Res3 = system.getUserAccountDirectory().createUserAccount("cook1res3", "Cook@345", new RestaurantCookRole());
        eaCook1Res3.setEmployee(cook1Res3);

        Employee cook2Res3 = res3.getEmployeeDirectory().createEmployee("Cook2Res3", "cook2res3@gmail.com");
        EmployeeAccount eaCook2Res3 = system.getUserAccountDirectory().createUserAccount("cook2res3", "Cook@678", new RestaurantCookRole());
        eaCook2Res3.setEmployee(cook2Res3);

        // Delivery Company 1
        DeliveryEnterprise del1 = network.getEnterpriseDirectory().createDelivery("FastTrack Deliveries", "123 Main St, Boston, MA", "9876543210", "fasttrack@gmail.com");

// Manager for Delivery Company 1
        Employee delMgr1 = del1.getEmployeeDirectory().createEmployee("DelManager1", "manager1@fasttrack.com");
        EmployeeAccount delMgrAcc1 = system.getUserAccountDirectory().createUserAccount("delman1", "Manager@123", new DeliveryManagerRole());
        delMgrAcc1.setEmployee(delMgr1);

// Delivery Persons for Delivery Company 1
        Employee delPer1 = del1.getEmployeeDirectory().createEmployee("DelPerson1", "person1@fasttrack.com");
        EmployeeAccount delPerAcc1 = system.getUserAccountDirectory().createUserAccount("delper1", "Person@123", new DeliveryPersonRole());
        delPerAcc1.setEmployee(delPer1);

        Employee delPer2 = del1.getEmployeeDirectory().createEmployee("DelPerson2", "person2@fasttrack.com");
        EmployeeAccount delPerAcc2 = system.getUserAccountDirectory().createUserAccount("delper2", "Person@456", new DeliveryPersonRole());
        delPerAcc2.setEmployee(delPer2);

// Delivery Company 2
        DeliveryEnterprise del2 = network.getEnterpriseDirectory().createDelivery("QuickShip Logistics", "456 Elm St, Cambridge, MA", "8765432109", "quickship@gmail.com");

// Manager for Delivery Company 2
        Employee delMgr2 = del2.getEmployeeDirectory().createEmployee("DelManager2", "manager2@quickship.com");
        EmployeeAccount delMgrAcc2 = system.getUserAccountDirectory().createUserAccount("delman2", "Manager@456", new DeliveryManagerRole());
        delMgrAcc2.setEmployee(delMgr2);

// Delivery Persons for Delivery Company 2
        Employee delPer3 = del2.getEmployeeDirectory().createEmployee("DelPerson3", "person3@quickship.com");
        EmployeeAccount delPerAcc3 = system.getUserAccountDirectory().createUserAccount("delper3", "Person@789", new DeliveryPersonRole());
        delPerAcc3.setEmployee(delPer3);

        Employee delPer4 = del2.getEmployeeDirectory().createEmployee("DelPerson4", "person4@quickship.com");
        EmployeeAccount delPerAcc4 = system.getUserAccountDirectory().createUserAccount("delper4", "Person@012", new DeliveryPersonRole());
        delPerAcc4.setEmployee(delPer4);

        // Grocery Store 1
        GroceryEnterprise ge1 = network.getEnterpriseDirectory().createStore("FreshMart", "1234567890", "123 Market St, Boston, MA", "freshmart@gmail.com");
        Employee geEmp1 = ge1.getEmployeeDirectory().createEmployee("Manager1", "manager1@freshmart.com");
        EmployeeAccount geEa1 = system.getUserAccountDirectory().createUserAccount("freshmartMgr", "Manager@123", new StoreManagerRole());
        geEa1.setEmployee(geEmp1);

// Menu items for Grocery Store 1
        ge1.getGroceryCatalog().createGroceryItem("Milk", 3.99, 50);
        ge1.getGroceryCatalog().createGroceryItem("Eggs", 2.99, 30);
        ge1.getGroceryCatalog().createGroceryItem("Bread", 2.49, 4);
        ge1.getGroceryCatalog().createGroceryItem("Butter", 4.99, 20);
        ge1.getGroceryCatalog().createGroceryItem("Cheese", 5.99, 15);

// Grocery Store 2
        GroceryEnterprise ge2 = network.getEnterpriseDirectory().createStore("QuickGrocer", "9876543210", "456 Elm St, Cambridge, MA", "quickgrocer@gmail.com");
        Employee geEmp2 = ge2.getEmployeeDirectory().createEmployee("Manager2", "manager2@quickgrocer.com");
        EmployeeAccount geEa2 = system.getUserAccountDirectory().createUserAccount("quickgrocerMgr", "Manager@456", new StoreManagerRole());
        geEa2.setEmployee(geEmp2);

// Menu items for Grocery Store 2
        ge2.getGroceryCatalog().createGroceryItem("Rice", 1.99, 100);
        ge2.getGroceryCatalog().createGroceryItem("Lentils", 2.49, 7);
        ge2.getGroceryCatalog().createGroceryItem("Sugar", 3.49, 80);
        ge2.getGroceryCatalog().createGroceryItem("Salt", 0.99, 90);
        ge2.getGroceryCatalog().createGroceryItem("Cooking Oil", 8.99, 2);

// Grocery Store 3
        GroceryEnterprise ge3 = network.getEnterpriseDirectory().createStore("DailyNeeds", "5647382910", "789 Willow St, Somerville, MA", "dailyneeds@gmail.com");
        Employee geEmp3 = ge3.getEmployeeDirectory().createEmployee("Manager3", "manager3@dailyneeds.com");
        EmployeeAccount geEa3 = system.getUserAccountDirectory().createUserAccount("dailyneedsMgr", "Manager@789", new StoreManagerRole());
        geEa3.setEmployee(geEmp3);

// Menu items for Grocery Store 3
        ge3.getGroceryCatalog().createGroceryItem("Apples", 3.99, 5);
        ge3.getGroceryCatalog().createGroceryItem("Bananas", 0.99, 9);
        ge3.getGroceryCatalog().createGroceryItem("Oranges", 4.49, 50);
        ge3.getGroceryCatalog().createGroceryItem("Potatoes", 2.99, 80);
        ge3.getGroceryCatalog().createGroceryItem("Tomatoes", 3.49, 70);

        // Inventory Enterprise 1
        InventoryEnterprise inv1 = network.getEnterpriseDirectory().createInventory("WarehouseHub", "123 Main St, Boston, MA", "Boston", "warehousehub@gmail.com");
        Employee invEmp1 = inv1.getEmployeeDirectory().createEmployee("Manager1", "manager1@warehousehub.com");
        EmployeeAccount invEa1 = system.getUserAccountDirectory().createUserAccount("warehouseMgr1", "Manager@123", new InventoryManagerRole());
        invEa1.setEmployee(invEmp1);

// Inventory Enterprise 2
        InventoryEnterprise inv2 = network.getEnterpriseDirectory().createInventory("StockDepot", "456 Center St, Cambridge, MA", "Cambridge", "stockdepot@gmail.com");
        Employee invEmp2 = inv2.getEmployeeDirectory().createEmployee("Manager2", "manager2@stockdepot.com");
        EmployeeAccount invEa2 = system.getUserAccountDirectory().createUserAccount("stockMgr2", "Manager@456", new InventoryManagerRole());
        invEa2.setEmployee(invEmp2);

        // Analytics Enterprise
        AnalyticsEnterprise ana1 = network.getEnterpriseDirectory().createAnalytics("DataVision", "789 Analytics St, Boston, MA", "Boston", "datavision@gmail.com");

// Create an employee for the Analytics Enterprise
        Employee anaEmp1 = ana1.getEmployeeDirectory().createEmployee("Data Analyst", "analyst@datavision.com");

// Create an employee account for the Analytics Member
        EmployeeAccount anaEa = system.getUserAccountDirectory().createUserAccount("DataAnalyst", "Analyze@123", new AnalyticsMemberRole());
        anaEa.setEmployee(anaEmp1);

        // Restaurant Admin
        Employee restaurantAdmin = system.getEmployeeDirectory().createEmployee("RestaurantAdmin", "restaurantadmin@gmail.com");
        EmployeeAccount restaurantAdminAccount = system.getUserAccountDirectory().createUserAccount("restaurantAdmin", "ResAdmin@123", new RestaurantAdminRole());
        restaurantAdminAccount.setEmployee(restaurantAdmin);

// Grocery Admin
        Employee groceryAdmin = system.getEmployeeDirectory().createEmployee("GroceryAdmin", "groceryadmin@gmail.com");
        EmployeeAccount groceryAdminAccount = system.getUserAccountDirectory().createUserAccount("groceryAdmin", "GroAdmin@123", new StoreAdminRole());
        groceryAdminAccount.setEmployee(groceryAdmin);

// Delivery Admin
        Employee deliveryAdmin = system.getEmployeeDirectory().createEmployee("DeliveryAdmin", "deliveryadmin@gmail.com");
        EmployeeAccount deliveryAdminAccount = system.getUserAccountDirectory().createUserAccount("deliveryAdmin", "DelAdmin@123", new DeliveryAdminRole());
        deliveryAdminAccount.setEmployee(deliveryAdmin);

        ArrayList<CustomerAccount> customerFaker = MockOrderGeneration.generateFakerCustomers(10);
        for (CustomerAccount ca : customerFaker) {
            CustomerAccount cu = system.getUserAccountDirectory().createCustomerAccount(ca.getUsername(), ca.getPassword(), new CustomerRole());
            cu.setCustomer(ca.getCustomer());
            cu.setWorkQ(ca.getWorkQueue());
            ArrayList<OrderRequest> ors = MockOrderGeneration.generateOrdersForCustomer(ca, 5);
            System.out.println(ors.get(0).getAmount());
        }

        return system;
    }
}
