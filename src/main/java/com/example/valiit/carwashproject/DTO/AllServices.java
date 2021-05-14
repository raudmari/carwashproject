package com.example.valiit.carwashproject.DTO;


import com.example.valiit.carwashproject.Booking.ServiceType;

public class AllServices {
    private String washType;
    private Double price;
    private Double duration;

    public AllServices(ServiceType serviceType){
        this.duration = serviceType.getDuration();
        this.price = serviceType.getPrice();
        this.washType = serviceType.getWashType();
    }

    public String getWashType() {
        return washType;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
