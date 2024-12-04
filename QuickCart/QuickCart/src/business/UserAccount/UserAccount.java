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
    private WorkQueue workQ;
    

    public UserAccount(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.workQ = new WorkQueue();
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
    
     public WorkQueue getWorkQueue() {
        return this.workQ;
    }

    public void setWorkQ(WorkQueue workQ) {
        this.workQ = workQ;
    }
    
    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}