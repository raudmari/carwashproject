package com.example.valiit.carwashproject.Booking;

public class WashStationInfoResponse {
    private Integer id;
    private String title;

    public WashStationInfoResponse(WashStation washStation) {
        this.id = washStation.getId();
        this.title = washStation.getCity() + ": " + washStation.getAddress();
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
