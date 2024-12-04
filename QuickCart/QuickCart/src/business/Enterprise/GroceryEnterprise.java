/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Item.GroceryCatalog;
import business.Item.GroceryItem;
import business.Role.Role;
import business.WorkQueue.ItemRestockRequest;
import business.WorkQueue.OrderRequest;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class GroceryEnterprise extends Enterprise {

    private int id;
    private int counter = 1;
    private GroceryCatalog groceryCatalog;
    private boolean isApproved;
    private ArrayList<InventoryEnterprise> inventoryList;
    private ArrayList<OrderRequest> groceryOrders;
    
    public GroceryEnterprise(String name, String address, String phone, String email) {
        super(name, address, phone, email, EnterpriseType.Grocery);
        this.id = counter;
        groceryCatalog = new GroceryCatalog();
        inventoryList = new ArrayList<>();
        this.groceryOrders = new ArrayList<>();
        counter++;
    }
    
    public GroceryCatalog getGroceryCatalog(){
        return groceryCatalog;
    }
    
    public void addInventory(InventoryEnterprise enterprise){
        inventoryList.add(enterprise);
    }
    
    public void removeInventory(InventoryEnterprise enterprise){
        inventoryList.remove(enterprise);
    }

    public ArrayList<InventoryEnterprise> getInventoryList() {
        return inventoryList;
    }
    
    public ArrayList<GroceryItem> checkForShortage() {
        ArrayList<GroceryItem> shortageItems = new ArrayList<>();
        for (GroceryItem item : groceryCatalog.getGroceryCatalog()) {
            if (item.getAvailability() < 5) {
                shortageItems.add(item);
            }
        }
        System.out.println(shortageItems.size());
        return shortageItems;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public void approveRequest() {
        this.isApproved = true;
    }

    public void rejectRequest() {
        this.isApproved = false;
    }
    
    public boolean isApproved() {
        return isApproved;
    }
    
    public void requestRestocking(InventoryEnterprise inventoryEnterprise, ArrayList<GroceryItem> shortageItems) {
        ItemRestockRequest restockRequest = new ItemRestockRequest(this, inventoryEnterprise, shortageItems);
        inventoryEnterprise.addRestockRequest(restockRequest);
    }
    
    public ArrayList<OrderRequest> getGroceryOrders() {
        return groceryOrders;
    }

    public void addOrder(OrderRequest order) {
        this.groceryOrders.add(order);
    }
    
    public double getAverageRating() {
        int totalRating = 0;
        int numberOfReviews = 0;

        for (OrderRequest order : this.groceryOrders) {
            if (order.getReview() > 0) { 
                totalRating += order.getReview();
                numberOfReviews++;
            }
        }

        return numberOfReviews > 0 ? (double) totalRating / numberOfReviews : 0.0;
}

}
