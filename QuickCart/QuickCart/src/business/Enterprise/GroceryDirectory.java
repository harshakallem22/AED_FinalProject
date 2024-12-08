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
public class GroceryDirectory {
    private ArrayList<GroceryEnterprise> groceryList;
    
    public GroceryDirectory(){
        this.groceryList = new ArrayList<>();
    }
    
    public GroceryEnterprise newGrocery(String name, String phone, String address, String email){
        GroceryEnterprise re = new GroceryEnterprise(name, phone, address, email);
        groceryList.add(re);
        return re;
    }

    public ArrayList<GroceryEnterprise> getGroceryList() {
        return groceryList;
    }
    
    public GroceryEnterprise findGroceryByName(String name) {
        for (GroceryEnterprise res : groceryList) {
            if (res.getName().equalsIgnoreCase(name)) {
                return res;
            }
        }
        return null;
    }

    public void removeGrocery(GroceryEnterprise restaurant) {
        groceryList.remove(restaurant);
    }
    
}
