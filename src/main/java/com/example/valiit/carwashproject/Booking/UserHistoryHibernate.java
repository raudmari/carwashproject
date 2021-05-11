package com.example.valiit.carwashproject.Booking;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class UserHistoryHibernate {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer customerId;
    private Integer serviceTypeId;
    private Integer washStationId;
    private LocalDate dateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public Integer getWashStationId() {
        return washStationId;
    }

    public void setWashStationId(Integer washStationId) {
        this.washStationId = washStationId;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
