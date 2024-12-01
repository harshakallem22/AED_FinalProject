/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author SAI SRIDHAR
 */
public class EmployeeAccount extends UserAccount {

    private Employee employee;
    private WorkQueue workQueue;

    public EmployeeAccount(String username, String password, Role role) {
        super(username, password, role);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee em) {
        this.employee = em;
    }
}
