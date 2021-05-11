package com.example.valiit.carwashproject.DTO;

import com.example.valiit.carwashproject.Booking.UserHistoryHibernate;

import java.time.LocalDate;
import java.util.List;

public class UserHistory {

    private LocalDate washDateTime;
    private Integer washType;
    private Integer washStation;

    public UserHistory(UserHistoryHibernate userHistoryHibernate){
        this.washDateTime = userHistoryHibernate.getDateTime();
        this.washType = userHistoryHibernate.getServiceTypeId();
        this.washStation = userHistoryHibernate.getWashStationId();
    }

    public LocalDate getWashDateTime() {
        return washDateTime;
    }

    public void setWashDateTime(LocalDate washDateTime) {
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
}
