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
    private RestaurantDirectory restaurantDir;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
        restaurantDir = new RestaurantDirectory();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, String phone, String address, String email, EnterpriseType type){
        Enterprise enterprise=null;
        if (null != type) switch (type) {
            case Restaurant:
                restaurantDir = new RestaurantDirectory();
                enterprise = restaurantDir.newRestaurant(name, phone, address, email);
                return enterprise;
            case Grocery:
                enterprise = new GroceryEnterprise(name, phone, address, email);
                enterpriseList.add(enterprise);
                break;
            case Delivery:
                enterprise = new DeliveryEnterprise(name, phone, address, email);
                enterpriseList.add(enterprise);
                break;
            case Analytics:
                enterprise = new AnalyticsEnterprise(name, phone, address, email);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
    
    public RestaurantDirectory getRestaurants(){
        return restaurantDir;
    }
    
    public RestaurantEnterprise createRestaurant(String name, String phone, String address, String email){
        RestaurantEnterprise enterprise = restaurantDir.newRestaurant(name, phone, address, email);
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
}
