/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.Customer.FoodItemOrder;
import business.Customer.ItemOrder;
import business.Enterprise.Enterprise.EnterpriseType;
import business.Enterprise.RestaurantEnterprise;
import business.Item.FoodItem;
import business.Network.Network;
import business.UserAccount.CustomerAccount;
import business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrderJPanel
     */
    Network network;
    CustomerAccount account;
    EnterpriseType type;
    RestaurantEnterprise restaurant;
    public CustomerOrderJPanel(Network network, CustomerAccount account) {
        initComponents();
        this.network = network;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();

        tblStores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Outlet", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStores);

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMenu);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Restaurants");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Grocery Stores");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Add to Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(399, 399, 399))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            type = EnterpriseType.Restaurant;
            DefaultTableModel dtm = (DefaultTableModel) tblStores.getModel();
            dtm.setRowCount(0);
            System.out.println(network);
            System.out.println(network.getEnterpriseDirectory().getRestaurants().getRestaurantList());
            
            for (RestaurantEnterprise res : network.getEnterpriseDirectory().getRestaurants().getRestaurantList()) {
                Object row[] = new Object[2];
                row[0] = res;
                row[1] = res;
                dtm.addRow(row);
            }
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void tblStoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStoresMouseClicked
        // TODO add your handling code here:
        int index = tblStores.getSelectedRow();
        TableModel model = tblStores.getModel();
        restaurant = (RestaurantEnterprise) model.getValueAt(index, 0);
        
        DefaultTableModel dtm = (DefaultTableModel) tblMenu.getModel();
        dtm.setRowCount(0);
      
            for (FoodItem f : restaurant.getMenu().getMenu()) {
                Object row[] = new Object[2];
                row[0] = f;
                row[1] = f.getPrice();
                dtm.addRow(row);
            }
        
        
    }//GEN-LAST:event_tblStoresMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenu.getSelectedRow();

        if (selectedRow >= 0) {
            FoodItem item = (FoodItem) tblMenu.getValueAt(selectedRow, 0);
            int quantity = (int) quantitySpinner.getValue();

            ItemOrder line = null;
            if (this.type.equals(EnterpriseType.Restaurant)) {
                line = new FoodItemOrder(this.restaurant, item, quantity);
            }
//            if (this.type.equals(ShopType.Store)) {
//                line = new ProductOrder(this.shop, item, quantity);
//            }
            if (!this.account.getCart().isCartEmpty()) {
                for (ItemOrder or : this.account.getCart().getItemList()) {
                    if (!or.getShopModel().equals(this.restaurant)) {
                        int choice = JOptionPane.showConfirmDialog(null, "You alreay have dashes from other restaurant in shopping cart. \n"
                                + "Adding this dash will remove all previous dashes in shopping cart.\n" + "Do you want to continue?",
                                "Restaurant Conflicts", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            this.account.getCart().clearCart();
                            break;
                        } else {
                            return;
                        }
                    }
                    if (or.getShopModel().equals(this.restaurant) && or.getItem().equals(item)) {
                        line.setQuantity(or.getQuantity() + quantity);
                        this.account.getCart().getItemList().remove(or);
                        break;
                    }
                }
            }
            this.account.getCart().addToCart(line);

            JOptionPane.showMessageDialog(null, "Dash has been successfully added to Shopping Cart");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a dash.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTable tblStores;
    // End of variables declaration//GEN-END:variables
}
