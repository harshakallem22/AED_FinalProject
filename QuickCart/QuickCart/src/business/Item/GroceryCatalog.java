/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Item;

import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class GroceryCatalog {
    
    private ArrayList<GroceryItem> groceryCatalog;
    
    public GroceryCatalog(){
        this.groceryCatalog = new ArrayList<>();
    }
    
    public ArrayList<GroceryItem> getGroceryCatalog() {
        return groceryCatalog;
    }
    
    public void createGroceryItem(String name, double price, int availability){
        GroceryItem gi = new GroceryItem(name, price, availability);
        groceryCatalog.add(gi);
    }
    
}
