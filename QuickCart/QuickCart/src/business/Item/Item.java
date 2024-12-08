/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Item;

/**
 *
 * @author SAI SRIDHAR
 */
public class Item {
    private int id;
    private String name;
    private double price;
    private static int counter = 1;
    public Item(String name, double price){
        id = counter;
        this.name = name;
        this.price = price;
        counter++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
    @Override
    public String toString(){
        return name;
    }
}
