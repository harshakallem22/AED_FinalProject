/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, EnterpriseType type){
        Enterprise enterprise=null;
        if (null != type) switch (type) {
            case Restaurant:
                enterprise = new RestaurantEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Grocery:
                enterprise = new GroceryEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Delivery:
                enterprise = new DeliveryEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Analytics:
                enterprise = new AnalyticsEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
}
