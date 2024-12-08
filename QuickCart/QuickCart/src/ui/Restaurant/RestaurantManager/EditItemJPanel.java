/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Restaurant.RestaurantManager;

import ui.Grocery.GroceryManager.*;
import business.EcoSystem.EcoSystem;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class EditItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddItemJPanel
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    RestaurantEnterprise res;
    Network network;
    public EditItemJPanel(JPanel workArea, UserAccount account, EcoSystem ecosystem, RestaurantEnterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.account = account;
        this.ecosystem = ecosystem;
        this.res = enterprise;
        network = ecosystem.getNetworkList().get(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        jLabel1.setText("Item Name");

        jLabel2.setText("Item Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(422, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getItemName() {
        return jTextField1.getText().trim();
    }

    public String getItemPrice() {
        return jTextField2.getText().trim();
    }


    public void setItemName(String name) {
        jTextField1.setText(name);
    }

    public void setItemPrice(String price) {
        jTextField2.setText(price);
    }

   

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
