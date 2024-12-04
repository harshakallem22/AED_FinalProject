/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Network;

import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Enterprise.RestaurantEnterprise;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
//    public ArrayList<RestaurantEnterprise> getRestaurantEnterprise(){
//        ArrayList<RestaurantEnterprise> resList = new ArrayList<>();
//        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
//            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Restaurant)){
//                resList.add((RestaurantEnterprise) e);
//            }
//        }
//        return resList;
//    }
    
    public ArrayList<Enterprise> getStoreEnterprises() {
    ArrayList<Enterprise> storeList = new ArrayList<>();
    for (Enterprise e : enterpriseDirectory.getEnterpriseList()) {
        if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Grocery)) {
            storeList.add(e);
        }
    }
    return storeList;
}
    
    
    public ArrayList<RestaurantEnterprise> getRestaurantEnterprises() {
    ArrayList<RestaurantEnterprise> storeList = new ArrayList<>();
    for (Enterprise e : enterpriseDirectory.getEnterpriseList()) {
        if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Restaurant)) {
            storeList.add((RestaurantEnterprise)e);
        }
    }
    return storeList;
}
    
    @Override
    public String toString(){
        return name;
    }
    
}