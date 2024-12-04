/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
        } else if (type.getValue().equals(Type.RestaurantManager.getValue())) {
            organization = new RestaurantManagerOrganization();
        } else if (type.getValue().equals(Type.FoodPreparationOrganization.getValue())) {
            organization = new FoodPreparationOrganization();
        } else if (type.getValue().equals(Type.GroceryManager.getValue())) {
            organization = new GroceryManagerOrganization();
        } else if (type.getValue().equals(Type.InventoryManager.getValue())) {
            organization = new InventoryManagerOrganization();
        } else if (type.getValue().equals(Type.DeliveryManager.getValue())) {
            organization = new DeliveryManagerOrganization();
        } else if (type.getValue().equals(Type.DeliveryMan.getValue())) {
            organization = new DeliveryManOrganization();
        } else if (type.getValue().equals(Type.AnalyticsManager.getValue())) {
            organization = new AnalyticsManagerOrganization();
        }
        return organization;
    }
    
    public Organization getTypicalOrganization(Type type) {
    for (Organization or : this.organizationList) {
        // Check if the organization's name matches the type value (case-insensitive)
        if (or.getName().equalsIgnoreCase(type.getValue())) {
            return or;
        }
    }
    // Return null if no matching organization is found
    return null;
}
}
