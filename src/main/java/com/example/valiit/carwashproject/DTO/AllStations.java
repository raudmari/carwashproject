package com.example.valiit.carwashproject.DTO;

import com.example.valiit.carwashproject.Booking.WashStation;


public class AllStations {
    private String city;
    private String address;
    private String stationName;

    public AllStations(WashStation washStation) {
        this.city = washStation.getCity();
        this.address = washStation.getAddress();
        this.stationName = washStation.getStationName();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
