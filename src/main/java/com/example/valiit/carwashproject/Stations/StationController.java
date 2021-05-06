package com.example.valiit.carwashproject.Stations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {

    @Autowired
    private StationService stationService;

    @GetMapping("/api/public/carWash/station")
    public List<AllStations> getStations() {return stationService.getAllStations(); }
}
