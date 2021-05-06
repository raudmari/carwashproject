package com.example.valiit.carwashproject.Booking;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceType {
    @Id
    private Integer id;
    private Double price;
    private String duration;
    private String washType;

    public ServiceType() {
        this.getId();
        this.getPrice();
        this.getDuration();
        this.getWashType();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getWashType() {
        return washType;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }
}
