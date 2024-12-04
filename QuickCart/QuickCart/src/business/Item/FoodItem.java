/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Item;

/**
 *
 * @author SAI SRIDHAR
 */
public class FoodItem extends Item{
    private int id;
    private static int counter = 1;
 
    public FoodItem(String name, double price){
        super(name, price);
        this.id = counter;
    }
}
