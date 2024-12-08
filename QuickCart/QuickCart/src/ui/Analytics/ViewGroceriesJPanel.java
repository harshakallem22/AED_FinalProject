/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Analytics;

import business.EcoSystem.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.FakerMockData.MockOrderGeneration;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;
import business.WorkQueue.OrderRequest;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class ViewGroceriesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewGroceriesJPanel
     */
    Network network;
    JPanel workArea;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    public ViewGroceriesJPanel(JPanel workArea, EmployeeAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        network = business.getNetworkList().get(0);
        this.workArea = workArea;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        initComponents();
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

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(162, 243, 111));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel4.setText("Rating");

        jTextField3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("GROCERY STORES");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel2.setText("No. of Orders");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel3.setText("Revenue");

        jTextField2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnView)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnView)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a store.");
            return;
        }
        GroceryEnterprise grocery = (GroceryEnterprise) jTable1.getValueAt(selectedRow, 0);
        ArrayList<OrderRequest> orders = MockOrderGeneration.generateGroceryOrders(grocery, 20);
        double totalRevenue = 0;
        int totalOrders = orders.size();
        int totalRating = 0;
        int ratedOrdersCount = 0;

        for (OrderRequest order : orders) {
            totalRevenue += order.getAmount(); // Accumulate revenue
            if (order.getReview() > 0) { // If the order has a valid review
                totalRating += order.getReview();
                ratedOrdersCount++;
            }
        }

        double averageRating = ratedOrdersCount > 0 ? (double) totalRating / ratedOrdersCount : 0.0;

        // Display the results in the text fields
        jTextField1.setText(String.valueOf(totalOrders)); // Set number of orders
        jTextField2.setText(String.format("%.2f", totalRevenue));
        jTextField3.setText(String.format("%.1f", averageRating));
    }//GEN-LAST:event_btnViewActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        ArrayList<GroceryEnterprise> groceries = network.getEnterpriseDirectory().getGrocery().getGroceryList();
        System.out.println(groceries.size());
        for (GroceryEnterprise grocery : groceries) {
            Object[] row = new Object[4];
            row[0] = grocery;    
            row[1] = grocery.getAddress();  
            row[2] = grocery.getEmail();

            model.addRow(row); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
