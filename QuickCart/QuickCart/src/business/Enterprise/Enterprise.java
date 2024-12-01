/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;

/**
 *
 * @author SAI SRIDHAR
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    String name;
    String phone;
    String email;
    String address;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Restaurant("Restaurant"),
        Grocery("Grocery"),
        Delivery("Delivery"),
        Analytics("Analytics");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name, String address, String phone, String email, EnterpriseType type){
        super(name);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email=email;
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}