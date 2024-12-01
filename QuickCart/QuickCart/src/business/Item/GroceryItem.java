/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Item;

/**
 *
 * @author SAI SRIDHAR
 */
public class GroceryItem extends Item{
    private int id;
    private static int counter = 1;
    private static int availability;
    
    public GroceryItem(String name, double price, int availability){
        super(name, price);
        this.id = counter;
        this.availability = availability;
        counter++;
    }
}
