/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.EcoSystem.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class StoreManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new StoreManagerWorkAreaJPanel(userProcessContainer, account, organization, business);
        return null;
    }
}
