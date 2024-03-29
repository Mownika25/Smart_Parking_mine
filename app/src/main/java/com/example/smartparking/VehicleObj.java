package com.example.smartparking;

public class VehicleObj {
    int noOfWheels;
    float dimension;//keep either 1
    String vehno, vehId,userId,startTime,endTime;//registration no.

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public float getDimension() {
        return dimension;
    }

    public String getVehno() {
        return vehno;
    }

    public String getVehId() {
        return vehId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setVehId(String vehId) {
        this.vehId = vehId;
    }

    public void setVehno(String vehno) {
        this.vehno = vehno;
    }
    VehicleObj()
    {
        noOfWheels=0;
        dimension=0;
        vehId=vehno=userId=null;
    }
}
