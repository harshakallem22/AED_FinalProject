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
    private DeliveryDirectory deliveryDir;
    private GroceryDirectory groceryDir;
    private InventoryDirectory inventoryDir;
    private AnalyticsDirectory analyticsDir;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
        restaurantDir = new RestaurantDirectory();
        deliveryDir = new DeliveryDirectory();
        groceryDir = new GroceryDirectory();
        inventoryDir = new InventoryDirectory();
        analyticsDir = new AnalyticsDirectory();
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
    
    public DeliveryDirectory getDelivery(){
        return deliveryDir;
    }
    
    public GroceryDirectory getGrocery(){
        return groceryDir;
    }
    
    public RestaurantEnterprise createRestaurant(String name, String phone, String address, String email){
        RestaurantEnterprise enterprise = restaurantDir.newRestaurant(name, phone, address, email);
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
   public DeliveryEnterprise createDelivery(String name, String phone, String address, String email){
       DeliveryEnterprise enterprise = deliveryDir.newDelivery(name, phone, address, email);
       enterpriseList.add(enterprise);
       return enterprise;
   }
   
   public GroceryEnterprise createStore(String name, String phone, String address, String email){
       GroceryEnterprise enterprise = groceryDir.newGrocery(name, phone, address, email);
       enterpriseList.add(enterprise);
       return enterprise;
   }
   
   public InventoryEnterprise createInventory(String name, String phone, String address, String email){
       InventoryEnterprise enterprise = inventoryDir.newInventory(name, phone, address, email);
       enterpriseList.add(enterprise);
       return enterprise;
   }
   
   public AnalyticsEnterprise createAnalytics(String name, String phone, String address, String email){
       AnalyticsEnterprise enterprise = analyticsDir.newAnalytics(name, phone, address, email);
       analyticsDir.newAnalytics(name, phone, address, email);
       return enterprise;
   }
    
}
