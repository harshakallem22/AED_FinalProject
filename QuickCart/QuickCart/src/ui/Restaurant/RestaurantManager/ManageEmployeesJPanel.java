/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Restaurant.RestaurantManager;

import ui.Delivery.DeliveryManager.*;
import ui.Restaurant.RestaurantManager.*;
import business.EcoSystem.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class ManageEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmployeeJPanel
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    RestaurantEnterprise restaurant;
    Network network;
    public ManageEmployeesJPanel(JPanel workArea, UserAccount account, EcoSystem ecosystem, RestaurantEnterprise enterprise) {
        initComponents(); 
        this.workArea = workArea;
        this.account = account; 
        this.ecosystem = ecosystem; 
        this.restaurant = enterprise; 
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
        tblEmployees = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 60, 72));

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(97, 97, 97)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnDelete))
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame addEmployeeFrame = new JFrame("Add Employee");
        addEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addEmployeeFrame.setSize(600, 400);
        addEmployeeFrame.setLocationRelativeTo(null);

        AddEmployee addEmployeePanel = new AddEmployee(workArea, account, ecosystem, restaurant);
        addEmployeeFrame.add(addEmployeePanel);

        addEmployeeFrame.setVisible(true);
        addEmployeeFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                populateTable();
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:int selectedRow = tblEmployees.getSelectedRow();
        int selectedRow = tblEmployees.getSelectedRow();
        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select an employee to edit.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String employeeName = (String) tblEmployees.getValueAt(selectedRow, 0);
        String employeeEmail = (String) tblEmployees.getValueAt(selectedRow, 1);

        Employee selectedEmployee = restaurant.getEmployeeDirectory().findEmployeeByEmail(employeeEmail);

        if (selectedEmployee == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Employee not found.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        JFrame editEmployeeFrame = new JFrame("Edit Employee");
        editEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editEmployeeFrame.setSize(600, 400);
        editEmployeeFrame.setLocationRelativeTo(null);

        EditEmployee editEmployeePanel = new EditEmployee(workArea, account, ecosystem, restaurant, selectedEmployee);
        editEmployeeFrame.add(editEmployeePanel);

        editEmployeeFrame.setVisible(true);
        
        editEmployeeFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                populateTable();
            }
        });

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployees.getSelectedRow();  

        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select an employee to delete.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String employeeEmail = (String) tblEmployees.getValueAt(selectedRow, 1);
        Employee selectedEmployee = restaurant.getEmployeeDirectory().findEmployeeByEmail(employeeEmail);

        if (selectedEmployee == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Employee not found.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to delete this employee?", 
                "Confirm Deletion", 
                javax.swing.JOptionPane.YES_NO_OPTION, 
                javax.swing.JOptionPane.WARNING_MESSAGE);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            restaurant.getEmployeeDirectory().getEmployeeList().remove(selectedEmployee);

            populateTable();

            javax.swing.JOptionPane.showMessageDialog(this, "Employee deleted successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0); 
        for (Employee employee : restaurant.getEmployeeDirectory().getEmployeeList()) {

            Object[] row = new Object[2];  
            row[0] = employee.getName();
            row[1] = employee.getEmail();

            model.addRow(row);  
        }
}

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployees;
    // End of variables declaration//GEN-END:variables
}
