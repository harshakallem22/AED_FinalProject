/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Delivery.DeliveryManager;

import business.EcoSystem.EcoSystem;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.EmployeeAccount;
import business.WorkQueue.DeliveryRequest;
import business.WorkQueue.OrderRequest;
import business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.Grocery.GroceryManager.*;
import ui.Restaurant.RestaurantManager.*;

/**
 *
 * @author SAI SRIDHAR
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    JPanel upc;
    EmployeeAccount ea;
    Organization org;
    DeliveryEnterprise enterprise;
    EcoSystem ecosystem;
    Network network;
    public ManageOrderJPanel(JPanel upc, EmployeeAccount ea, EcoSystem ecosystem, DeliveryEnterprise enterprise) {
        initComponents();
        this.upc = upc;
        this.ea =  ea;
        this.enterprise =  enterprise;
        this.ecosystem = ecosystem;
        this.network = ecosystem.getNetworkList().get(0);
        populateTable();
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
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 185, 73));

        jTable1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Customer Name", "Customer Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton2.setText("Assign Task");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jButton2)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select an order to assign");
            return;
        }
        DeliveryRequest selectedOrder = (DeliveryRequest) jTable1.getValueAt(selectedRow, 1);
        selectedOrder.assignDeliveryPartner();
        javax.swing.JOptionPane.showMessageDialog(null, "Order assigned to the delivery employee");
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Clear existing rows
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DeliveryRequest) {
                DeliveryRequest deliveryRequest = (DeliveryRequest) workRequest;

                    Object[] row = new Object[4];
                    row[0] = deliveryRequest.getOrderId();         // Order ID
                    row[1] = deliveryRequest;  // Customer Name
                    row[2] = deliveryRequest.getDeliveryAddress(); // Customer Address
                    row[3] = deliveryRequest.getStatus();         
                    model.addRow(row);  // Add the row to the table
            }
        }
    }
}