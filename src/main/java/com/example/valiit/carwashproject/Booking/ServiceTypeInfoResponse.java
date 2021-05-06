package com.example.valiit.carwashproject.Booking;

public class ServiceTypeInfoResponse {

    private Integer id;
    private String title;

    public ServiceTypeInfoResponse(ServiceType serviceType) {
        this.id = serviceType.getId();
        this.title = serviceType.getWashType() + ": " + serviceType.getPrice() + " EUR: " + serviceType.getPrice() + " min";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
