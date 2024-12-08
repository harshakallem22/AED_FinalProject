/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Customer.ItemOrder;
import business.Enterprise.DeliveryEnterprise;
//import business.Enterprise.DeliveryCompany.DeliveryCompany;
import business.Enterprise.Enterprise;
import business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author SAI SRIDHAR
 */
public class OrderRequest extends WorkRequest {

    private String id;
    private String deliveryName;
    private String deliveryAddress;
    private String deliveryPhone;
    private double amount;
    private Enterprise company;
    private String merchant;
    private ArrayList<ItemOrder> dashes;
     private UserAccount assignedTo;
     private DeliveryRequest deliveryRequest=null;
     private int review;

    public OrderRequest(Enterprise enterprise, UserAccount account, ArrayList<ItemOrder> dashes) {
        super.setSender(account);
        this.dashes = dashes;
        this.id = UUID.randomUUID().toString();
        this.company = enterprise;
//        this.review = null;
    }

    public String getOrderId() {
        return id;
    }
    
    public DeliveryRequest getDeliveryRequest() {
        return this.deliveryRequest;
    }
    
    public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
        this.deliveryRequest = deliveryRequest;
    }

    public enum ReviewStatus {

        NA("N/A"),
        reviewed("Reviewed"),
        not("Not Reviewed");

        private String value;

        private ReviewStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String getId() {
        return this.id;
    }

    public String getDeliveryName() {
        return this.deliveryName;
    }

    public void setDeliveryName(String name) {
        this.deliveryName = name;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public void setDeliveryAddress(String address) {
        this.deliveryAddress = address;
    }

    public String getDeliveryPhone() {
        return this.deliveryPhone;
    }

    public void setDeliveryPhone(String phone) {
        this.deliveryPhone = phone;
    }

    public ArrayList<ItemOrder> getItems() {
        return this.dashes;
    }

//   

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
    
    public void setAssignedTo(UserAccount assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setCompany(DeliveryEnterprise company) {
        this.company = company;
    }
    
    public void setReview(int review){
        this.review = review;
    }
    
    public int getReview(){
        return this.review;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public ArrayList<ItemOrder> getDashes() {
        return dashes;
    }

    public void setDashes(ArrayList<ItemOrder> dashes) {
        this.dashes = dashes;
    }
    
    
    
    @Override
    public String toString(){
        return this.id;
    }
    
}
