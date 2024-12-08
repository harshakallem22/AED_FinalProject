/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Restaurant.RestaurantManager;

import business.EcoSystem.EcoSystem;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.DeliveryRequest;
import business.WorkQueue.OrderRequest;
import business.WorkQueue.WorkRequest;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    RestaurantEnterprise restaurant;
    Network network;
    public ManageOrderJPanel(JPanel workArea, UserAccount account, EcoSystem ecosystem, RestaurantEnterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.account = account;
        this.ecosystem = ecosystem;
        this.restaurant = enterprise;
        System.out.println(restaurant.getName());
        network = ecosystem.getNetworkList().get(0);
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
        orderTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 62, 70));

        orderTable.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Customer Name", "Customer Address", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton1.setText("View Detailed Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton2.setText("Assign Task");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton3.setText("Assign Delivery Partner");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
    if (selectedRow < 0) {
        javax.swing.JOptionPane.showMessageDialog(null, "Please select an order to assign");
        return;
    }
    OrderRequest selectedOrder = (OrderRequest) orderTable.getValueAt(selectedRow, 0);
    selectedOrder.setStatus("Assigned to Employee");
    javax.swing.JOptionPane.showMessageDialog(null, "Order assigned to the restaurant employee");
    populateTable(); // Refresh the table to show updated status
    restaurant.addOrder(selectedOrder);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select an order to assign a delivery partner");
            return;
        }
        
        OrderRequest selectedOrder = (OrderRequest) orderTable.getValueAt(selectedRow, 0);
        if (!selectedOrder.getStatus().equals("Order Prepared")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Only orders with 'Order Prepared' status can be assigned to a delivery partner.");
            return;
        }
        
        selectedOrder.setStatus("Assigning to Delivery Partner");
        //JOptionPane.showMessageDialog(null, "Delivery partner assigned to the order.");
        ArrayList<DeliveryEnterprise> deliveryCompanies = network.getEnterpriseDirectory().getDelivery().getDeliveryList();  // Assuming you have a list of delivery companies in the ecosystem
    
        JComboBox<DeliveryEnterprise> deliveryCompanyComboBox = new JComboBox<>();
        for (DeliveryEnterprise company : deliveryCompanies) {
            deliveryCompanyComboBox.addItem(company);
        }

        int option = JOptionPane.showConfirmDialog(
            null,
            deliveryCompanyComboBox,
            "Select Delivery Company",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            // Step 4: Get the selected delivery company
            DeliveryEnterprise selectedDeliveryCompany = (DeliveryEnterprise) deliveryCompanyComboBox.getSelectedItem();

            // Step 5: Create a new DeliveryRequest
            DeliveryRequest deliveryRequest = new DeliveryRequest(
                selectedDeliveryCompany, 
                selectedOrder.getSender(), 
                selectedOrder.getOrderId()
            );


            deliveryRequest.setDeliveryAddress(selectedOrder.getDeliveryAddress());
            deliveryRequest.setDeliveryPhone(selectedOrder.getDeliveryPhone());
            deliveryRequest.setDeliveryCharge(10.0); // Set a default or calculated charge
            selectedOrder.setDeliveryRequest(deliveryRequest);
            deliveryRequest.setOrderRequest(selectedOrder);

            selectedDeliveryCompany.getWorkQueue().getWorkRequestList().add(deliveryRequest);

            selectedOrder.setStatus("Assigning to Delivery Partner");

            javax.swing.JOptionPane.showMessageDialog(null, "Delivery partner assigning to the order.");

            populateTable();
    }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : restaurant.getWorkQueue().getWorkRequestList()) {
            OrderRequest or = (OrderRequest) wr;
            Object row[] = new Object[5];
            row[0] = or;
            row[1] = or.getDeliveryName();
            row[2] = or.getDeliveryPhone();
            row[3] = or.getAmount();
            row[4] = or.getStatus();
            dtm.addRow(row);
        }
    }
}
