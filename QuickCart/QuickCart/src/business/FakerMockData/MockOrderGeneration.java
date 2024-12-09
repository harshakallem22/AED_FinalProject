/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.FakerMockData;

import business.Customer.Customer;
import business.Customer.ItemOrder;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Role.CustomerRole;
import business.UserAccount.CustomerAccount;
import business.WorkQueue.OrderRequest;
import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class MockOrderGeneration {

    static Faker faker = new Faker();

     public static ArrayList<OrderRequest> generateRestaurantOrders(RestaurantEnterprise restaurant, int numOrders) {
        ArrayList<OrderRequest> restaurantOrders = new ArrayList<>();
                //ArrayList<OrderRequest> restaurantOrders = restaurant.getRestaurantOrders();

        for (int i = 0; i < numOrders; i++) {
            String customerName = faker.name().fullName();
            String address = faker.address().fullAddress();
            String phone = faker.phoneNumber().cellPhone();
            String comment = faker.lorem().sentence();
            double totalPrice = faker.number().randomDouble(2, 15, 150);

            OrderRequest order = new OrderRequest(restaurant, null, new ArrayList<>());
            order.setDeliveryName(customerName);
            order.setDeliveryAddress(address);
            order.setDeliveryPhone(phone);
            order.setMessage(comment);
//            order.getDeliveryRequest().orderDelivered();
            order.setReview(faker.number().numberBetween(2, 5));
            order.setAmount(BigDecimal.valueOf(totalPrice).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

            restaurantOrders.add(order);
            restaurant.addOrder(order);
        }
        return restaurantOrders;
    }
     
    public static ArrayList<OrderRequest> generateGroceryOrders(GroceryEnterprise grocery, int numOrders) {
        ArrayList<OrderRequest> groceryOrders = new ArrayList<>();

        for (int i = 0; i < numOrders; i++) {
            String customerName = faker.name().fullName();
            String address = faker.address().fullAddress();
            String phone = faker.phoneNumber().cellPhone();
            String comment = faker.lorem().sentence();
            double totalPrice = faker.number().randomDouble(2, 20, 100);

            OrderRequest order = new OrderRequest(grocery, null, new ArrayList<>());
            order.setDeliveryName(customerName);
            order.setDeliveryAddress(address);
            order.setDeliveryPhone(phone);
            order.setMessage(comment);
            //order.getDeliveryRequest().orderDelivered();
            order.setReview(faker.number().numberBetween(2, 5));
            order.setAmount(BigDecimal.valueOf(totalPrice).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

            groceryOrders.add(order);
            grocery.addOrder(order);
        }
        return groceryOrders;
    }
    
    public static ArrayList<CustomerAccount> generateFakerCustomers(int numCustomers) {
        ArrayList<CustomerAccount> fakerCustomers = new ArrayList<>();

        for (int i = 0; i < numCustomers; i++) {
            String name = faker.name().fullName();
            String email = faker.internet().emailAddress();
            String phone = faker.phoneNumber().cellPhone();
            String address = faker.address().fullAddress();

            Customer customer = new Customer(name, email, phone, address);
            CustomerAccount customerAccount = new CustomerAccount(name, "password", new CustomerRole()); 
            customerAccount.setCustomer(customer);
            generateOrdersForCustomer(customerAccount, 10);
            fakerCustomers.add(customerAccount);
        }

        return fakerCustomers;
    }

    public static ArrayList<OrderRequest> generateOrdersForCustomer(CustomerAccount selectedCustomer, int numOrders) {
        ArrayList<OrderRequest> orders = new ArrayList<>();

        for (int i = 0; i < numOrders; i++) {
            OrderRequest order = new OrderRequest(null, null, null); 
            order.setAmount(faker.number().randomDouble(2, 50, 200)); 
            selectedCustomer.getWorkQueue().getWorkRequestList().add(order);
            orders.add(order);
        }

        return orders;
    }
    

}
