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
//import business.DBConn.DatabaseConnection;
//import business.Employee.Employee;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class EmployeeDAO {
//
//    public static Connection getConnection() throws SQLException {
//        return DatabaseConnection.getConnection();
//    }
//    
//    public static boolean addEmployee(String name, String email, String username, String password, String roleName, String enterpriseName) {
//        String employeeSql = "INSERT INTO employee (name, email, role_id, enterprise_id) VALUES (?, ?, " +
//                         "(SELECT role_id FROM role WHERE role_name = ?), " +
//                         "(SELECT enterprise_id FROM enterprise WHERE enterprise_name = ?)) RETURNING employee_id";
//
//    String accountSql = "INSERT INTO user_account (username, password, employee_id) VALUES (?, ?, ?)";
//
//    try (Connection conn = getConnection()) {
//        conn.setAutoCommit(false);  // Start transaction
//
//        int employeeId;
//
//        try (PreparedStatement empPs = conn.prepareStatement(employeeSql)) {
//            empPs.setString(1, name);
//            empPs.setString(2, email);
//            empPs.setString(3, roleName);
//            empPs.setString(4, enterpriseName);
//
//            try (ResultSet rs = empPs.executeQuery()) {
//                if (rs.next()) {
//                    employeeId = rs.getInt("employee_id");  
//                } else {
//                    conn.rollback();
//                    throw new SQLException("Failed to retrieve Employee ID.");
//                }
//            }
//        }
//
//        try (PreparedStatement accPs = conn.prepareStatement(accountSql)) {
//            accPs.setString(1, username);
//            accPs.setString(2, password);
//            accPs.setInt(3, employeeId);
//
//            int accRows = accPs.executeUpdate();
//            if (accRows <= 0) {
//                conn.rollback();  // Rollback if insertion failed
//                throw new SQLException("Failed to insert User Account.");
//            }
//        }
//
//        // Commit the transaction
//        conn.commit();
//        System.out.println("Employee and account added successfully.");
//        return true;
//
//    } catch (SQLException e) {
//        e.printStackTrace();
//        return false;
//    }
//
//    }
//
//    public static boolean updateEmployee(String oldName, String oldEmail, String newName, String newEmail) {
//        String sql = "UPDATE employee SET name = ?, email = ? WHERE name = ? AND email = ?";
//
//        try (Connection conn = getConnection(); 
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setString(1, newName);
//            ps.setString(2, newEmail);
//            ps.setString(3, oldName);
//            ps.setString(4, oldEmail);
//
//            int rowsUpdated = ps.executeUpdate();
//            return rowsUpdated > 0;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    // Delete Employee
//    public static boolean deleteEmployee(String name, String email) {
//        String sql = "DELETE FROM employee WHERE name = ? AND email = ?";
//
//        try (Connection conn = getConnection(); 
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setString(1, name);
//            ps.setString(2, email);
//
//            int rowsDeleted = ps.executeUpdate();
//            return rowsDeleted > 0;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    // Retrieve All Employees
//    public static ArrayList<Employee> getAllEmployees() {
//        ArrayList<Employee> employees = new ArrayList<>();
//        String sql = "SELECT * FROM employee";
//
//        try (Connection conn = getConnection(); 
//             Statement stmt = conn.createStatement(); 
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                employees.add(new Employee(
//                        rs.getString("name"),
//                        rs.getString("email")
//                ));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employees;
//    }
//
//    // Find Employee by Email
//    //public static Employee getEmployeeByEmail(String email) {
////        String sql = "SELECT * FROM employee WHERE email = ?";
////        
////        try (Connection conn = getConnection(); 
////             PreparedStatement ps = conn.prepareStatement(sql)) {
////
////            ps.setString(1, email);
////
////            try (ResultSet rs = ps.executeQuery()) {
////                if (rs.next()) {
////                    return new Employee(
////                            rs.getString("name"),
////                            rs.getString("email"),
////                            rs.getInt("role_id"),
////                            rs.getInt("enterprise_id")
////                    );
////                }
////            }
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        return null;
////    }
//}
