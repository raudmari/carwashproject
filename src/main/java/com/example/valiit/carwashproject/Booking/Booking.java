package com.example.valiit.carwashproject.Booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer washStationId;
    private Integer serviceTypeId;
    private Integer customerId;
    private LocalDateTime dateTime;
    private Integer pin =1+ (int) (Math.random() * 1000);

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWashStationId() {
        return washStationId;
    }

    public void setWashStationId(Integer washStationId) {
        this.washStationId = washStationId;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}




