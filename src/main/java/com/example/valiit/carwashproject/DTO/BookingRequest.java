package com.example.valiit.carwashproject.DTO;

import java.time.LocalDateTime;

public class BookingRequest {
    private Integer customerId;
    private LocalDateTime dateTime;
    private Integer pin = 1+ (int) (Math.random() * 1000);
    private Integer washStationId;
    private Integer serviceTypeId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
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
}
