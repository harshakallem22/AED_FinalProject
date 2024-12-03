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
public class AnalyticsDirectory {
    private ArrayList<AnalyticsEnterprise> analyticsList;
    
    public AnalyticsDirectory(){
        this.analyticsList = new ArrayList<>();
    }
    
    public AnalyticsEnterprise newAnalytics(String name, String phone, String address, String email){
        AnalyticsEnterprise re = new AnalyticsEnterprise(name, phone, address, email);
        analyticsList.add(re);
        return re;
    }

    public ArrayList<AnalyticsEnterprise> getAnalyticsList() {
        return analyticsList;
    }
}
