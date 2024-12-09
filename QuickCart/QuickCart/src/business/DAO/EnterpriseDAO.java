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
//
//import business.Enterprise.Enterprise;
//import business.DBConn.DatabaseConnection;
//
//import java.sql.*;
//import java.util.ArrayList;
//
//public class EnterpriseDAO {
//    public static void addEnterprise(String name, String type) {
//        String sql = "INSERT INTO enterprise (name, type) VALUES (?, ?)";
//
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setString(1, name);
//            ps.setString(2, type);
//
//            int rows = ps.executeUpdate();
//            if (rows > 0) {
//                System.out.println("Enterprise added successfully.");
//            } else {
//                System.out.println("Failed to add enterprise.");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
////    public static ArrayList<Enterprise> getAllEnterprises() {
////        ArrayList<Enterprise> enterprises = new ArrayList<>();
////        String sql = "SELECT * FROM enterprise";
////
////        try (Connection conn = DatabaseConnection.getConnection();
////             Statement stmt = conn.createStatement();
////             ResultSet rs = stmt.executeQuery(sql)) {
////
////            while (rs.next()) {
////                enterprises.add(new Enterprise(
////                        rs.getInt("enterprise_id"),
////                        rs.getString("name"),
////                        rs.getString("type")
////                ));
////            }
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        return enterprises;
////    }
//}
