/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DeliveryAdmin;

import ui.RestaurantEnterpriseAdmin.*;
import business.EcoSystem.EcoSystem;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.EmployeeAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.Restaurant.RestaurantManager.AddEmployee;

/**
 *
 * @author SAI SRIDHAR
 */
public class ManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     */
    JPanel userProcessContainer;
    EmployeeAccount account; Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    Network network;
    public ManageJPanel(JPanel userProcessContainer, EmployeeAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = (EmployeeAccount) account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.network = this.business.getNetworkList().get(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 173, 245));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery Name", "Delivery Address", "Delivery Phone", "Delivery Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(153, 153, 153)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFrame addEmployeeFrame = new JFrame("Add Enterprise");
        addEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addEmployeeFrame.setSize(900, 900);
        addEmployeeFrame.setLocationRelativeTo(null);

        AddEnterpriseJPanel addEmployeePanel = new AddEnterpriseJPanel(userProcessContainer, account, organization, business, enterprise);
        addEmployeeFrame.add(addEmployeePanel);

        addEmployeeFrame.setVisible(true);
        addEmployeeFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                populateTable();
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

    if (selectedRow < 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select an enterprise to edit.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    DeliveryEnterprise restaurantName = (DeliveryEnterprise) jTable1.getValueAt(selectedRow, 0);

    // Find the selected restaurant
    DeliveryEnterprise selectedRestaurant = network.getEnterpriseDirectory().getDelivery().findDeliveryByName(restaurantName.getName());

    if (selectedRestaurant == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Enterprise not found.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    JFrame editRestaurantFrame = new JFrame("Edit Delivery Enterprise");
    editRestaurantFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    editRestaurantFrame.setSize(900, 900);
    editRestaurantFrame.setLocationRelativeTo(null);

    EditEnterpriseJPanel editRestaurantPanel = new EditEnterpriseJPanel(userProcessContainer, account, organization, business, selectedRestaurant);
    editRestaurantFrame.add(editRestaurantPanel);

    editRestaurantFrame.setVisible(true);
    editRestaurantFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            populateTable();
        }
    });

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

    if (selectedRow < 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a delivery enterprise to delete.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    DeliveryEnterprise restaurantName = (DeliveryEnterprise) jTable1.getValueAt(selectedRow, 0);

    DeliveryEnterprise restaurantToDelete = network.getEnterpriseDirectory().getDelivery().findDeliveryByName(restaurantName.getName());

    if (restaurantToDelete == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Enterprise not found.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete this enterprise?",
            "Confirm Deletion", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE);

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        network.getEnterpriseDirectory().getDelivery().removeDelivery(restaurantToDelete);
        populateTable();
        javax.swing.JOptionPane.showMessageDialog(this, "Enterprise deleted successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_jButton5ActionPerformed
    
    
    private void populateTable() {
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    dtm.setRowCount(0);  // Clear the existing table rows

    for (DeliveryEnterprise res : network.getEnterpriseDirectory().getDelivery().getDeliveryList()) {
        Object[] row = new Object[4];
        row[0] = res;
        row[1] = res.getAddress();
        row[2] = res.getPhone();
        row[3] = res.getEmail();
        dtm.addRow(row);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
