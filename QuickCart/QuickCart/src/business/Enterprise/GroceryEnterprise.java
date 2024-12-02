/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Item.GroceryCatalog;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class GroceryEnterprise extends Enterprise {

    private int id;
    private int counter = 1;
    private GroceryCatalog groceryCatalog;
    public GroceryEnterprise(String name, String address, String phone, String email) {
        super(name, address, phone, email, EnterpriseType.Grocery);
        this.id = counter;
        groceryCatalog = new GroceryCatalog();
        counter++;
    }
    
    public GroceryCatalog getGroceryCatalog(){
        return groceryCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
