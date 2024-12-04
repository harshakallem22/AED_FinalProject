/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Enterprise.GroceryEnterprise;
import business.Enterprise.InventoryEnterprise;
import business.Item.GroceryItem;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */

public class ItemRestockRequest extends WorkRequest {

    private GroceryEnterprise targetStore;
    private InventoryEnterprise inventoryEnterprise;
    private ArrayList<GroceryItem> shortageItems;
    private String status;

    public ItemRestockRequest(GroceryEnterprise targetStore, InventoryEnterprise inventoryEnterprise, ArrayList<GroceryItem> shortageItems) {
        this.targetStore = targetStore;
        this.inventoryEnterprise = inventoryEnterprise;
        this.shortageItems = shortageItems;
        this.status = "Pending"; // Default status
    }

    // Getters and setters
    public GroceryEnterprise getTargetStore() {
        return targetStore;
    }

    public void setTargetStore(GroceryEnterprise targetStore) {
        this.targetStore = targetStore;
    }

    public InventoryEnterprise getInventoryEnterprise() {
        return inventoryEnterprise;
    }

    public void setInventoryEnterprise(InventoryEnterprise inventoryEnterprise) {
        this.inventoryEnterprise = inventoryEnterprise;
    }

    public ArrayList<GroceryItem> getShortageItems() {
        return shortageItems;
    }

    public void setShortageItems(ArrayList<GroceryItem> shortageItems) {
        this.shortageItems = shortageItems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void markAsCompleted() {
        this.status = "Completed";  
    }
    
    @Override
    public String toString(){
        return targetStore.getName();
    }
}
