/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.DAO;

/**
 *
 * @author SAI SRIDHAR
 */
import business.Customer.Customer;
import business.DBConn.DatabaseConnection;
<<<<<<< Updated upstream
=======
import business.Role.CustomerRole;
import business.UserAccount.CustomerAccount;
>>>>>>> Stashed changes
import java.sql.*;
import java.util.ArrayList;

public class CustomerDAO {

<<<<<<< Updated upstream
    // Method to establish a database connection
=======
>>>>>>> Stashed changes
    public static Connection getConnection() throws SQLException {
        return DatabaseConnection.getConnection();
    }

  
<<<<<<< Updated upstream
    public static void addCustomer(String email, String name, String phone, String address) {
        String sql = "INSERT INTO customer (email, name, phone, address) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // Set parameters for the prepared statement
            ps.setString(1, email);    // Set email
            ps.setString(2, name);     // Set name
            ps.setString(3, phone);    // Set phone
            ps.setString(4, address);  // Set address

            // Execute the insert query
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Customer added successfully.");
            } else {
                System.out.println("Failed to add customer.");
            }

        } catch (SQLException e) {
            // Handle SQL exception
=======
    public static void addCustomer(String email, String username, String phone, String address, String password) {
        String customerSql = "INSERT INTO customer (email, name, phone, address) VALUES (?, ?, ?, ?)";
        String accountSql = "INSERT INTO customer_account (username, password, customer_id) VALUES (?, ?, ?)";

        try (Connection conn = getConnection()) {
            if (conn.isClosed()) {
                throw new SQLException("Database connection is closed.");
            }
            conn.setAutoCommit(false);

            int customerId;
            try (PreparedStatement customerPs = conn.prepareStatement(customerSql, Statement.RETURN_GENERATED_KEYS)) {
                customerPs.setString(1, email);
                customerPs.setString(2, username);
                customerPs.setString(3, phone);
                customerPs.setString(4, address);

                int customerRows = customerPs.executeUpdate();

                if (customerRows > 0) {
                    try (ResultSet rs = customerPs.getGeneratedKeys()) {
                        if (rs.next()) {
                            customerId = rs.getInt(1); 
                        } else {
                            conn.rollback(); 
                            throw new SQLException("Failed to retrieve customer ID.");
                        }
                    }
                } else {
                    conn.rollback(); 
                    throw new SQLException("Failed to insert customer.");
                }
            }

            try (PreparedStatement accountPs = conn.prepareStatement(accountSql)) {
                accountPs.setString(1, username);
                accountPs.setString(2, password);
                accountPs.setInt(3, customerId);
                int accountRows = accountPs.executeUpdate();

                if (accountRows <= 0) {
                    conn.rollback(); 
                    throw new SQLException("Failed to insert customer account.");
                }
            }

            conn.commit(); 
            System.out.println("Customer and account added successfully.");
        } catch (SQLException e) {
>>>>>>> Stashed changes
            e.printStackTrace();
        }
    }
    
<<<<<<< Updated upstream
    public static ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM customer";

        try (Connection conn = getConnection(); 
             Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Customer customer = new Customer(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address")
                );
                customerList.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
=======
    
    public static ArrayList<CustomerAccount> getAllCustomers() {
        ArrayList<CustomerAccount> customerList = new ArrayList<>();

        String customerQuery = "SELECT c.id, c.email, c.name, c.phone, c.address, "
                + "ca.username, ca.password FROM customer c "
                + "JOIN customer_account ca ON c.id = ca.customer_id";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(customerQuery);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int customerId = rs.getInt("id");
                String email = rs.getString("email");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String username = rs.getString("username");
                String password = rs.getString("password");

                Customer customer = new Customer(name, email, phone, address);
                CustomerAccount customerAccount = new CustomerAccount(username, password, new CustomerRole());
                customerAccount.setCustomer(customer);

                customerList.add(customerAccount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

>>>>>>> Stashed changes
        return customerList;
    }
    
}