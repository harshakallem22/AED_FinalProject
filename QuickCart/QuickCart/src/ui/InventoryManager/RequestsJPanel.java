/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.InventoryManager;

import business.EcoSystem.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.InventoryEnterprise;
import business.Item.GroceryItem;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.ItemRestockRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class RequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestsJPanel
     */
    JPanel workArea;
    UserAccount account; Organization organization;
    EcoSystem business;
    InventoryEnterprise enterprise;
    public RequestsJPanel(JPanel workArea, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = (InventoryEnterprise)enterprise;
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

        btnSendItems = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        btnSendItems.setText("Send Items");
        btnSendItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendItemsActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Store Name", "Email", "Address", "Item Count", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

        jButton1.setText("View Detailed Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshJButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(36, 36, 36)
                            .addComponent(btnSendItems))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(refreshJButton)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendItems)
                    .addComponent(jButton1))
                .addContainerGap(354, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendItemsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
    if (selectedRow >= 0) {
        // Get the selected restock request
        ItemRestockRequest selectedRequest = (ItemRestockRequest) tblRequests.getValueAt(selectedRow, 0); // Assuming the request object is stored in the 3rd column
        ArrayList<GroceryItem> shortageItems = selectedRequest.getShortageItems();
        
        // Send items and update the availability in the store
        for (GroceryItem item : shortageItems) {
            // Increase the availability of the item in the store by 100
            item.setAvailability(item.getAvailability() + 100);
        }
        
        // Mark the request as completed
        selectedRequest.markAsCompleted();
        populateTable();
    } else {
        JOptionPane.showMessageDialog(this, "Please select a request to send.");
    }
    }//GEN-LAST:event_btnSendItemsActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendItems;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
    model.setRowCount(0); 
    
    for (ItemRestockRequest request : enterprise.getRestockRequests()) {
        Object[] row = new Object[5];
        row[0] = request; 
        row[1] = request.getTargetStore().getEmail(); 
        row[2] = request.getTargetStore().getAddress(); 
        row[3] = request.getShortageItems().size(); 
        row[4] = request.getStatus();
        model.addRow(row);
    }
    }
}
