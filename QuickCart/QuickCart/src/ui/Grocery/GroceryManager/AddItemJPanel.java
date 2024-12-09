/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Grocery.GroceryManager;

import business.EcoSystem.EcoSystem;
import business.Enterprise.GroceryEnterprise;
import business.Item.GroceryItem;
import business.Network.Network;
import business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class AddItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddItemJPanel
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    GroceryEnterprise grocery;
    Network network;
    public AddItemJPanel(JPanel workArea, UserAccount account, EcoSystem ecosystem, GroceryEnterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.account = account;
        this.ecosystem = ecosystem;
        this.grocery = enterprise;
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
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(248, 203, 70));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel1.setText("Item Name");

        jTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel2.setText("Item Price");

        jTextField2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel3.setText("Availability");

        jTextField3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(274, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String itemName = jTextField1.getText().trim();
    String itemPriceText = jTextField2.getText().trim();
    String availabilityText = jTextField3.getText().trim();
    
    for(GroceryItem item : grocery.getGroceryCatalog().getGroceryCatalog()){
            if(item.getName().equals(itemName)){
                JOptionPane.showMessageDialog(this, "Item name already exists");
                return;
            }
        }
    
    if (itemName.isEmpty() || itemPriceText.isEmpty() || availabilityText.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "All fields are required!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double itemPrice = Double.parseDouble(itemPriceText);
        int availability = Integer.parseInt(availabilityText);

        // Add the item to the Grocery Catalog
        grocery.getGroceryCatalog().createGroceryItem(itemName, itemPrice, availability);

        // Show success message
        javax.swing.JOptionPane.showMessageDialog(this, "Item added successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // Reset the form fields
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

    } catch (NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid price or availability. Please enter numeric values.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
