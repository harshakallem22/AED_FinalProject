/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Role to edit this template
 */
package business.Role;

import business.EcoSystem.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public abstract class Role {
    public enum RoleType{
        Customer("Customer"),
        RestaurantManager("Restaurant Manager"),
        RestaurantCook("Restaurant Cook"),
        StoreManager("Store Manager"),
        InventoryManager("Inventory Manager"),
        DeliveryManager("Delivery Manager"),
        DeliveryPerson("Delivery Person"),
        AnalyticsMember("Analytics Member");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
