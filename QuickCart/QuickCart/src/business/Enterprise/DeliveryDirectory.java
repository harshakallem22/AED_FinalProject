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
public class DeliveryDirectory {
    private ArrayList<DeliveryEnterprise> deliveryList;
    
    public DeliveryDirectory(){
        this.deliveryList = new ArrayList<>();
    }
    
    public DeliveryEnterprise newDelivery(String name, String phone, String address, String email){
        DeliveryEnterprise re = new DeliveryEnterprise(name, phone, address, email);
        deliveryList.add(re);
        return re;
    }

    public ArrayList<DeliveryEnterprise> getDeliveryList() {
        return deliveryList;
    }
    
    public DeliveryEnterprise findDeliveryByName(String name) {
        for (DeliveryEnterprise res : deliveryList) {
            if (res.getName().equalsIgnoreCase(name)) {
                return res;
            }
        }
        return null;
    }

    public void removeDelivery(DeliveryEnterprise restaurant) {
        deliveryList.remove(restaurant);
    }
}
