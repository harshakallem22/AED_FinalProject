/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Enterprise.Enterprise;
import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author SAI SRIDHAR
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status="Processing";
    private Enterprise enterprise;
    
//    public enum StatusEnum {
//
//        Processing("Processing"),
//        Ready("Ready for pickup"),
//        WaitForPickup("Waiting for pickup"),
//        OnTheWay("On the way"),
//        Cancelled("Cancelled"),
//        Completed("Completed");
//
//        private String value;
//
//        private StatusEnum(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    
    
}
