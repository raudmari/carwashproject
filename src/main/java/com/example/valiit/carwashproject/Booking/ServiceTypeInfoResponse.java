package com.example.valiit.carwashproject.Booking;

public class ServiceTypeInfoResponse {

    private Integer id;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ServiceTypeInfoResponse(ServiceType serviceType) {
        this.id = serviceType.getId();
        this.text = serviceType.getWashType() + ": " + serviceType.getPrice() + " EUR: " + serviceType.getPrice() + " min";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
