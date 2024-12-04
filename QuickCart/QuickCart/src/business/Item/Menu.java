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
public class Menu {
    private ArrayList<FoodItem> menu;
    
    public Menu(){
        menu = new ArrayList<>();
    }

    public ArrayList<FoodItem> getMenu() {
        return menu;
    }
    
    public void createFoodItem(String name, double price){
        FoodItem fi = new FoodItem(name, price);
        menu.add(fi);
        //return fi;
    }
    
}
