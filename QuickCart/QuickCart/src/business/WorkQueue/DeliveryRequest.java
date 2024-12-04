/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;


import business.Enterprise.DeliveryEnterprise;
import business.UserAccount.UserAccount;
import business.Enterprise.Enterprise;
import java.util.UUID;

/**
 *
 * @author SAI SRIDHAR
 */

public class DeliveryRequest extends WorkRequest {

    private String id;
    private String status;
    private String deliveryPartnerName;
    private String deliveryAddress;
    private String deliveryPhone;
    private double deliveryCharge;
    private OrderRequest orderRequest;
    private DeliveryEnterprise deliveryCompany;
    private UserAccount assignedTo;
    private String orderId; // Associated Order ID (from OrderRequest)

    public DeliveryRequest(Enterprise enterprise, UserAccount account, String orderId) {
        super.setSender(account);
        this.id = UUID.randomUUID().toString();
        this.orderId = orderId;
        this.status = "Processing";
    }

    // Enum for Delivery Status
    public enum DeliveryStatus {
        DELIVERY_PERSON_ASSIGNED("Delivery Person Assigned"),
        ORDER_PICKED_UP("Order Picked Up"),
        ORDER_ON_THE_WAY("Order On The Way"),
        ORDER_DELIVERED("Order Delivered"),
        PENDING("Pending");

        private String value;

        private DeliveryStatus(String value) {
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

    // Getters and Setters for the fields
    public String getId() {
        return this.id;
    }

    public String getDeliveryPartnerName() {
        return this.deliveryPartnerName;
    }

    public void setDeliveryPartnerName(String deliveryPartnerName) {
        this.deliveryPartnerName = deliveryPartnerName;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryPhone() {
        return this.deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    public double getDeliveryCharge() {
        return this.deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public DeliveryEnterprise getDeliveryCompany() {
        return this.deliveryCompany;
    }

    public void setDeliveryCompany(DeliveryEnterprise deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public UserAccount getAssignedTo() {
        return this.assignedTo;
    }

    public void setAssignedTo(UserAccount assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return this.status;
    }


    public void assignDeliveryPartner() {
        this.status = DeliveryStatus.DELIVERY_PERSON_ASSIGNED.value;
        orderRequest.setStatus(this.status);
    }

    public void orderPickedUp() {
        this.status = DeliveryStatus.ORDER_PICKED_UP.value;
        orderRequest.setStatus(this.status);
    }

    public void orderOnTheWay() {
        this.status = DeliveryStatus.ORDER_ON_THE_WAY.value;
        orderRequest.setStatus(this.status);
    }
    
    public void orderDelivered(){
        this.status = DeliveryStatus.ORDER_DELIVERED.value;
        orderRequest.setStatus(this.status);
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }
    
    public void setOrderRequest(OrderRequest or){
        orderRequest = or;
    }
    
    @Override
    public String toString(){
        return this.id;
    }
    
}
