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
public class DeliveryEnterprise extends Enterprise {
    
    private int id;
    private static int counter = 1;
    
    public DeliveryEnterprise(String name, String address, String phone, String email) {
        super(name, address, phone, email, EnterpriseType.Delivery);
        this.id = counter;
        counter++;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
