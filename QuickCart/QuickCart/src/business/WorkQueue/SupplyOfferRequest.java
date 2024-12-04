/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Enterprise.Enterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.InventoryEnterprise;
import business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author SAI SRIDHAR
 */

public class SupplyOfferRequest extends WorkRequest {
    private String id;                   
    private String inventoryName;          
    private String inventoryEmail;         
    private String inventoryLocation;      
    private GroceryEnterprise targetStore; 
    private String status;       
    private InventoryEnterprise enterprise;

    public SupplyOfferRequest(UserAccount sender, InventoryEnterprise inventory, GroceryEnterprise store, String message) {
        super.setSender(sender);
        this.inventoryName = inventory.getName();
        this.inventoryEmail = inventory.getEmail();
        this.inventoryLocation = inventory.getAddress();
        this.targetStore = store;
        this.status = "Pending"; // Default status
        this.id = java.util.UUID.randomUUID().toString();
        this.enterprise = inventory;
    }

    public String getId() {
        return id;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getInventoryEmail() {
        return inventoryEmail;
    }

    public void setInventoryEmail(String inventoryEmail) {
        this.inventoryEmail = inventoryEmail;
    }

    public String getInventoryLocation() {
        return inventoryLocation;
    }

    public void setInventoryLocation(String inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public GroceryEnterprise getTargetStore() {
        return targetStore;
    }

    public void setTargetStore(GroceryEnterprise targetStore) {
        this.targetStore = targetStore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        if(status.equals("Approved")){
            this.targetStore.addInventory(enterprise);
        }
    }
}
