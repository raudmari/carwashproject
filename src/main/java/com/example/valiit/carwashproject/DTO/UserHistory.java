package com.example.valiit.carwashproject.DTO;

import com.example.valiit.carwashproject.Booking.Booking;

import java.time.LocalDateTime;

public class UserHistory {

    private LocalDateTime washDateTime;
    private Integer washType;
    private Integer washStation;
    private String washStationName;
    private String washTypeName;

    public UserHistory(Booking booking){
        this.washDateTime = booking.getDateTime();
        this.washType = booking.getServiceType().getId();
        this.washStation = booking.getWashStation().getId();
        this.washTypeName = booking.getServiceType().getWashType();
        this.washStationName = booking.getWashStation().getStationName();
    }

    public LocalDateTime getWashDateTime() {
        return washDateTime;
    }

    public void setWashDateTime(LocalDateTime washDateTime) {
        this.washDateTime = washDateTime;
    }

    public Integer getWashType() {
        return washType;
    }

    public void setWashType(Integer washType) {
        this.washType = washType;
    }

    public Integer getWashStation() {
        return washStation;
    }

    public void setWashStation(Integer washStation) {
        this.washStation = washStation;
    }

    public String getWashStationName() {
        return washStationName;
    }

    public void setWashStationName(String washStationName) {
        this.washStationName = washStationName;
    }

    public String getWashTypeName() {
        return washTypeName;
    }

    public void setWashTypeName(String washTypeName) {
        this.washTypeName = washTypeName;
    }
}
