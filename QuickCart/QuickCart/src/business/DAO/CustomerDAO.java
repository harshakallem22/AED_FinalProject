//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package business.DAO;
//
///**
// *
// * @author SAI SRIDHAR
// */
//import business.Customer.Customer;
//import business.DBConn.DatabaseConnection;
//import business.Role.CustomerRole;
//import business.UserAccount.CustomerAccount;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class CustomerDAO {
//
//    // Method to establish a database connection
//    public static Connection getConnection() throws SQLException {
//        return DatabaseConnection.getConnection();
//    }
//
//  
//    public static void addCustomer(String email, String username, String phone, String address, String password) {
//        String customerSql = "INSERT INTO customer (email, name, phone, address) VALUES (?, ?, ?, ?)";
//        String accountSql = "INSERT INTO customer_account (username, password, customer_id) VALUES (?, ?, ?)";
//
//        try (Connection conn = getConnection()) {
//            if (conn.isClosed()) {
//                throw new SQLException("Database connection is closed.");
//            }
//            conn.setAutoCommit(false);
//
//            int customerId;
//            try (PreparedStatement customerPs = conn.prepareStatement(customerSql, Statement.RETURN_GENERATED_KEYS)) {
//                customerPs.setString(1, email);
//                customerPs.setString(2, username);
//                customerPs.setString(3, phone);
//                customerPs.setString(4, address);
//
//                int customerRows = customerPs.executeUpdate();
//
//                if (customerRows > 0) {
//                    try (ResultSet rs = customerPs.getGeneratedKeys()) {
//                        if (rs.next()) {
//                            customerId = rs.getInt(1); 
//                        } else {
//                            conn.rollback(); 
//                            throw new SQLException("Failed to retrieve customer ID.");
//                        }
//                    }
//                } else {
//                    conn.rollback(); 
//                    throw new SQLException("Failed to insert customer.");
//                }
//            }
//
//            try (PreparedStatement accountPs = conn.prepareStatement(accountSql)) {
//                accountPs.setString(1, username);
//                accountPs.setString(2, password);
//                accountPs.setInt(3, customerId);
//                int accountRows = accountPs.executeUpdate();
//
//                if (accountRows <= 0) {
//                    conn.rollback(); 
//                    throw new SQLException("Failed to insert customer account.");
//                }
//            }
//
//            conn.commit(); 
//            System.out.println("Customer and account added successfully.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    
//    public static ArrayList<CustomerAccount> getAllCustomers() {
//        ArrayList<CustomerAccount> customerList = new ArrayList<>();
//
//        String customerQuery = "SELECT c.id, c.email, c.name, c.phone, c.address, "
//                + "ca.username, ca.password FROM customer c "
//                + "JOIN customer_account ca ON c.id = ca.customer_id";
//
//        try (Connection conn = getConnection();
//             PreparedStatement ps = conn.prepareStatement(customerQuery);
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                int customerId = rs.getInt("id");
//                String email = rs.getString("email");
//                String name = rs.getString("name");
//                String phone = rs.getString("phone");
//                String address = rs.getString("address");
//                String username = rs.getString("username");
//                String password = rs.getString("password");
//
//                Customer customer = new Customer(name, email, phone, address);
//                CustomerAccount customerAccount = new CustomerAccount(username, password, new CustomerRole());
//                customerAccount.setCustomer(customer);
//
//                customerList.add(customerAccount);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return customerList;
//    }
//    
//}
