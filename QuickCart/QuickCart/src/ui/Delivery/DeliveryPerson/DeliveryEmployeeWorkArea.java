/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Delivery.DeliveryPerson;

import business.EcoSystem.EcoSystem;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;
import business.WorkQueue.DeliveryRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.LoginJPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class DeliveryEmployeeWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryEmployeeWorkArea
     */
    EmployeeAccount ea;
    Organization organization;
    EcoSystem ecosystem;
    JPanel workarea;
    DeliveryEnterprise enterprise;
    private DeliveryRequest selectedDeliveryRequest;
    public DeliveryEmployeeWorkArea(JPanel workArea, UserAccount account, EcoSystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.ea = (EmployeeAccount)account;
        this.workarea = workArea;
        this.ecosystem = ecosystem;
        this.enterprise = (DeliveryEnterprise) enterprise;
        populateTable();
        btnOnTheWay.setEnabled(false);  
        btnPickUp.setEnabled(false);  
        btnOrderDelivered.setEnabled(false); 
        ImageIcon gifIcon = new ImageIcon(getClass().getResource("/resources/delivery_man_gif.gif"));
        JLabel gifLabel = new JLabel(gifIcon); 

        deliveryGifJPanel.setLayout(new java.awt.BorderLayout());
        deliveryGifJPanel.add(gifLabel, java.awt.BorderLayout.CENTER); 

        deliveryGifJPanel.revalidate();
        deliveryGifJPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        btnPickUp = new javax.swing.JButton();
        btnOnTheWay = new javax.swing.JButton();
        btnOrderDelivered = new javax.swing.JButton();
        deliveryGifJPanel = new javax.swing.JPanel();

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order Id", "Order Items", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        btnPickUp.setText("Order Picked Up");
        btnPickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickUpActionPerformed(evt);
            }
        });

        btnOnTheWay.setText("Order on the Way");
        btnOnTheWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnTheWayActionPerformed(evt);
            }
        });

        btnOrderDelivered.setText("Order Delivered");
        btnOrderDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDeliveredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deliveryGifJPanelLayout = new javax.swing.GroupLayout(deliveryGifJPanel);
        deliveryGifJPanel.setLayout(deliveryGifJPanelLayout);
        deliveryGifJPanelLayout.setHorizontalGroup(
            deliveryGifJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );
        deliveryGifJPanelLayout.setVerticalGroup(
            deliveryGifJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnPickUp)
                .addGap(26, 26, 26)
                .addComponent(btnOnTheWay)
                .addGap(18, 18, 18)
                .addComponent(btnOrderDelivered)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignJButton))
                        .addGap(80, 80, 80)
                        .addComponent(deliveryGifJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnLogout)
                .addGap(32, 32, 32)
                .addComponent(refreshJButton)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(assignJButton)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPickUp)
                            .addComponent(btnOnTheWay)
                            .addComponent(btnOrderDelivered)))
                    .addComponent(deliveryGifJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(231, 231, 231))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        workarea.removeAll();

        LoginJPanel loginPanel = new LoginJPanel(workarea);
        workarea.add("LoginJPanel", loginPanel);

        CardLayout layout = (CardLayout) workarea.getLayout();
        layout.next(workarea);

        javax.swing.JOptionPane.showMessageDialog(null, "Logged out successfully.");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select an order to assign.");
            return;
        }
        selectedDeliveryRequest = (DeliveryRequest) workRequestJTable.getValueAt(selectedRow, 0);
    
     if(selectedDeliveryRequest.getStatus().equals("Delivery Person Assigned")){
            selectedDeliveryRequest.setAssignedTo(ea);
            selectedDeliveryRequest.assignDeliveryPartner();

            assignJButton.setEnabled(false);

            btnPickUp.setEnabled(true);
            populateTable();

            javax.swing.JOptionPane.showMessageDialog(null, "Order assigned to you.");
            btnOnTheWay.setEnabled(false);  
            btnPickUp.setEnabled(true);  
                btnOrderDelivered.setEnabled(false); 
            }

            else{
                JOptionPane.showMessageDialog(this, "Check order status!");
            }
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void btnPickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickUpActionPerformed
        // TODO add your handling code here:
        if (selectedDeliveryRequest != null) {
            selectedDeliveryRequest.orderPickedUp();
            assignJButton.setEnabled(false);
            btnOnTheWay.setEnabled(true);  
            btnPickUp.setEnabled(false);  
            btnOrderDelivered.setEnabled(false);
        }
        populateTable();
    }//GEN-LAST:event_btnPickUpActionPerformed

    private void btnOnTheWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnTheWayActionPerformed
        // TODO add your handling code here:
        if (selectedDeliveryRequest != null) {
            selectedDeliveryRequest.orderOnTheWay();
            assignJButton.setEnabled(false);
            btnOnTheWay.setEnabled(false);  
            btnPickUp.setEnabled(false);  
            btnOrderDelivered.setEnabled(true);
        }
        populateTable();
    }//GEN-LAST:event_btnOnTheWayActionPerformed

    private void btnOrderDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDeliveredActionPerformed
        // TODO add your handling code here:
        if (selectedDeliveryRequest != null) {
            selectedDeliveryRequest.orderDelivered();
            assignJButton.setEnabled(true);
            btnOnTheWay.setEnabled(false);  
            btnPickUp.setEnabled(false);  
            btnOrderDelivered.setEnabled(false); 
        }
        populateTable();
    }//GEN-LAST:event_btnOrderDeliveredActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOnTheWay;
    private javax.swing.JButton btnOrderDelivered;
    private javax.swing.JButton btnPickUp;
    private javax.swing.JPanel deliveryGifJPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);  // Clear the table
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
                if (workRequest instanceof DeliveryRequest) {
                    DeliveryRequest deliveryRequest = (DeliveryRequest) workRequest;
                    if((deliveryRequest.getStatus().equals("Delivery Person Assigned")) || 
                            (deliveryRequest.getStatus().equals("Order Picked Up")) ||
                            (deliveryRequest.getStatus().equals("Order On The Way")) ||
                                    (deliveryRequest.getStatus().equals("Order Delivered"))){
                        Object[] row = new Object[4];
                        row[0] = deliveryRequest;    
                        row[1] = deliveryRequest.getDeliveryAddress();  
                        row[2] = deliveryRequest.getStatus();
                        row[3] = deliveryRequest.getStatus();         
                        model.addRow(row);  
                    }
                }
        }
    }
}
