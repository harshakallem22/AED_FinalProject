/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

/**
 *
 * @author SAI SRIDHAR
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
        private String email;


    public Employee() {
        id = count;
        count++;
    }
    
    public Employee(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
