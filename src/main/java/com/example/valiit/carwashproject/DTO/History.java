package com.example.valiit.carwashproject.DTO;

public class History {

    private String username;
    private String serviceType;
    private String washStation;
    private Object date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getWashStation() {
        return washStation;
    }

    public void setWashStation(String washStation) {
        this.washStation = washStation;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
