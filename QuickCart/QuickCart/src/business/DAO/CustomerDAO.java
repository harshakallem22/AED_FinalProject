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
//    public static void addCustomer(String email, String name, String phone, String address) {
//        String sql = "INSERT INTO customer (email, name, phone, address) VALUES (?, ?, ?, ?)";
//
//        try (Connection conn = getConnection(); 
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            // Set parameters for the prepared statement
//            ps.setString(1, email);    // Set email
//            ps.setString(2, name);     // Set name
//            ps.setString(3, phone);    // Set phone
//            ps.setString(4, address);  // Set address
//
//            // Execute the insert query
//            int rowsAffected = ps.executeUpdate();
//            
//            if (rowsAffected > 0) {
//                System.out.println("Customer added successfully.");
//            } else {
//                System.out.println("Failed to add customer.");
//            }
//
//        } catch (SQLException e) {
//            // Handle SQL exception
//            e.printStackTrace();
//        }
//    }
//    
//    public static ArrayList<Customer> getAllCustomers() {
//        ArrayList<Customer> customerList = new ArrayList<>();
//        String sql = "SELECT * FROM customer";
//
//        try (Connection conn = getConnection(); 
//             Statement stmt = getConnection().createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                Customer customer = new Customer(
//                        rs.getString("name"),
//                        rs.getString("email"),
//                        rs.getString("phone"),
//                        rs.getString("address")
//                );
//                customerList.add(customer);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return customerList;
//    }
//    
//}