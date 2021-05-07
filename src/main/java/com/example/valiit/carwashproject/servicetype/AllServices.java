package com.example.valiit.carwashproject.servicetype;

public class AllServices {
    private String washType;
    private Double price;
    private Double duration;

    public AllServices(ServiceTypeHibernate serviceTypeHibernate){
        this.duration = serviceTypeHibernate.getDuration();
        this.price = serviceTypeHibernate.getPrice();
        this.washType = serviceTypeHibernate.getWashType();
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
