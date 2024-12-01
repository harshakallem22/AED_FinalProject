/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Role.Role;
import business.Employee.Employee;
import business.Role.Role;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author SAI SRIDHAR
 */
public abstract class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    

    public UserAccount(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
    
}