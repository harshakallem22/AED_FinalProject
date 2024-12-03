/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Delivery.DeliveryManager;

import business.EcoSystem.EcoSystem;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;
import ui.Grocery.GroceryManager.*;
import ui.Restaurant.RestaurantManager.*;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.LoginJPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class DeliveryManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantManagerWorkArea
     */
    JPanel upc;
    EmployeeAccount ea;
    Organization org;
    DeliveryEnterprise enterprise;
    EcoSystem ecosystem;
    public DeliveryManagerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.upc = userProcessContainer;
        this.ea = (EmployeeAccount) account;
        this.org = organization;
        this.enterprise = (DeliveryEnterprise) enterprise;
        this.ecosystem = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnDeliveries = new javax.swing.JButton();
        btnEmployees = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnDeliveries.setText("Manage Orders");
        btnDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveriesActionPerformed(evt);
            }
        });

        btnEmployees.setText("Manage Employees");
        btnEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeesActionPerformed(evt);
            }
        });

        btnProfile.setText("Profile");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(btnDeliveries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployees)
                .addGap(12, 12, 12)
                .addComponent(btnProfile)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveries)
                    .addComponent(btnEmployees)
                    .addComponent(btnProfile)
                    .addComponent(btnLogout))
                .addGap(31, 31, 31))
        );

        jSplitPane1.setTopComponent(jPanel1);

        workArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveriesActionPerformed
        // TODO add your handling code here:
       ManageOrderJPanel mojp = new ManageOrderJPanel(workArea, ea, ecosystem, enterprise);
        workArea.add("ManageOrderJPanel", mojp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.show(workArea, "ManageOrderJPanel");
    }//GEN-LAST:event_btnDeliveriesActionPerformed

    private void btnEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEmployeesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        upc.removeAll();

        LoginJPanel loginPanel = new LoginJPanel(upc);
        upc.add("LoginJPanel", loginPanel);

        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeliveries;
    private javax.swing.JButton btnEmployees;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}