/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Item.GroceryCatalog;
import business.Role.Role;
import business.WorkQueue.ItemRestockRequest;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class InventoryEnterprise extends Enterprise {
     private int id;
    private int counter = 1;
    private ArrayList<ItemRestockRequest> restockRequests;
    
    public InventoryEnterprise(String name, String address, String phone, String email) {
        super(name, address, phone, email, Enterprise.EnterpriseType.Inventory);
        this.id = counter;
        counter++;
        this.restockRequests = new ArrayList<>();
    }
    
    public ArrayList<ItemRestockRequest> getRestockRequests() {
        return restockRequests;
    }

    public void addRestockRequest(ItemRestockRequest request) {
        this.restockRequests.add(request);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
