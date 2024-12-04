/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class InventoryDirectory {
     private ArrayList<InventoryEnterprise> inventoryList;
    
    public InventoryDirectory(){
        this.inventoryList = new ArrayList<>();
    }
    
    public InventoryEnterprise newInventory(String name, String phone, String address, String email){
        InventoryEnterprise re = new InventoryEnterprise(name, phone, address, email);
        inventoryList.add(re);
        return re;
    }

    public ArrayList<InventoryEnterprise> getGroceryList() {
        return inventoryList;
    }
}
