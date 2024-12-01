/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.Role;
import business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class GroceryManagerOrganization extends Organization {

    public GroceryManagerOrganization() {
        super(Organization.Type.GroceryManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreManagerRole());
        return roles;
    }
}
