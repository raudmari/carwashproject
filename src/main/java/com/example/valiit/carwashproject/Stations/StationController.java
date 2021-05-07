package com.example.valiit.carwashproject.Stations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {

    @Autowired
    private StationService stationService;

    //http://localhost:9090/api/public/carWash/stations
    @GetMapping("/api/public/carWash/stations")
    public List<AllStations> getStations() {return stationService.getAllStations(); }
}
