/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Employee;

import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String email){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employeeList.add(employee);
        return employee;
    }
}
