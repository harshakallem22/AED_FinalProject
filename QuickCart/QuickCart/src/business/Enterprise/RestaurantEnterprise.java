/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Item.Menu;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class RestaurantEnterprise extends Enterprise {
    
    private int id;
    private Menu menu;
    private static int counter = 1;

    public RestaurantEnterprise(String name, String address, String phone, String email) {
        super(name, address, phone, email, EnterpriseType.Restaurant);
        this.menu = new Menu();
        this.id = counter;
        counter++;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public Menu getMenu() {
        return menu;
    }
    
    
}

