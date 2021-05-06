package com.example.valiit.carwashproject.Stations;

public class AllStations {
    private String city;
    private String address;
    private String stationName;

    public AllStations(StationsHibernate stationsHibernate) {
        this.city = stationsHibernate.getCity();
        this.address = stationsHibernate.getAddress();
        this.stationName = stationsHibernate.getStationName();
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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
