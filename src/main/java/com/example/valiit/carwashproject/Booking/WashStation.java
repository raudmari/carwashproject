package com.example.valiit.carwashproject.Booking;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WashStation {
    @Id
    private Integer id;
    private String city;
    private String address;



    public WashStation() {
        this.getId();
        this.getCity();
        this.getAddress();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
