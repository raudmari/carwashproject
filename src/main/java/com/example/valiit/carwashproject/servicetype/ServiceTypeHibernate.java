package com.example.valiit.carwashproject.servicetype;

import javax.persistence.*;

@Entity
@Table (name="service_type")
public class ServiceTypeHibernate {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Double price;
    private String washType;
    private Double duration;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getWashType() {
        return washType;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
