/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class DeliveryEnterprise extends Enterprise {

    public DeliveryEnterprise(String name, String address, String phone, String email) {
        super(name, address, phone, email, EnterpriseType.Delivery);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; 
    }
}
