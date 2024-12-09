/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class RestaurantDirectory {
    
    private ArrayList<RestaurantEnterprise> restaurantList;
    
    public RestaurantDirectory(){
        this.restaurantList = new ArrayList<>();
    }
    
    public RestaurantEnterprise newRestaurant(String name, String phone, String address, String email){
        RestaurantEnterprise re = new RestaurantEnterprise(name, address, phone, email);
        restaurantList.add(re);
        return re;
    }

    public ArrayList<RestaurantEnterprise> getRestaurantList() {
        return restaurantList;
    }
    
    public RestaurantEnterprise findRestaurantByName(String name) {
        for (RestaurantEnterprise res : restaurantList) {
            if (res.getName().equalsIgnoreCase(name)) {
                return res;
            }
        }
        return null;
    }

    public void removeRestaurant(RestaurantEnterprise restaurant) {
        restaurantList.remove(restaurant);
    }

}
