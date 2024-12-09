//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package business.DBConn;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
///**
// *
// * @author SAI SRIDHAR
// */
//public class DatabaseConnection {
//    private static final String URL = "jdbc:postgresql://localhost:5432/QuickCart";
//    private static final String USER = "postgres";
//    private static final String PASSWORD = "Nani@3489";
//    private static Connection connection;
//
//    public static Connection getConnection() throws SQLException {
//        if (connection == null) {
//            try {
//                Class.forName("org.postgresql.Driver");
//                connection = DriverManager.getConnection(URL, USER, PASSWORD);
//                System.out.println("Connected to the database!");
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//                throw new RuntimeException("Failed to connect to the database: " + e.getMessage());
//            }
//        }
//        return connection;
//    }
//    
//    public static void closeConnection() {
//        try {
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//                System.out.println("Database connection closed.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
