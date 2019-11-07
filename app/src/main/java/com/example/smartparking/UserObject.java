package com.example.smartparking;
//user and admin profiles re delete admin or user account

public class UserObject {
    String name,key,currentLocn, favLocn, vehicleNo, payment;

    public void setName(String name) {
        this.name = name;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public void setFavLocn(String favLocn) {
        this.favLocn = favLocn;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }


    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }


    public String getCurrentLocn() {
        return currentLocn;
    }

    public void setCurrentLocn(String currentLocn) {
        this.currentLocn = currentLocn;
    }

    public String getFavLocn() {
        return favLocn;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getPayment() {
        return payment;
    }

    UserObject()
    {
        name=null;
        key=null;
        currentLocn=null;
        favLocn=null;
        vehicleNo=null; payment=null;

    }
}

