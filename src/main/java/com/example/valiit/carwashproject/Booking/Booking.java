package com.example.valiit.carwashproject.Booking;


import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer customerId;
    private LocalDateTime dateTime;
    private Integer pin = 1+ (int) (Math.random() * 1000);
    @ManyToOne
    @JoinColumn(name="service_type_id")
    private ServiceType serviceType;
    @ManyToOne
    @JoinColumn(name="wash_station_id")
    private WashStation washStation;

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public WashStation getWashStation() {
        return washStation;
    }

    public void setWashStation(WashStation washStation) {
        this.washStation = washStation;
    }

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


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}




