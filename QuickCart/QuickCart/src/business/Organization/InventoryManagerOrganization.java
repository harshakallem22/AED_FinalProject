/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.InventoryManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class InventoryManagerOrganization extends Organization {

    public InventoryManagerOrganization() {
        super(Organization.Type.InventoryManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryManagerRole());
        return roles;
    }
}
