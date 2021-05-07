package com.example.valiit.carwashproject.Stations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    @Autowired
    private HibernateStationsRepository hibernateStationsRepository;

    public List<AllStations> getAllStations() {
        List<StationsHibernate> stationsAll = hibernateStationsRepository.findAllBy();
        List<AllStations> allStations = new ArrayList<>();
        for (StationsHibernate stationsHibernate : stationsAll) {
            allStations.add(new AllStations(stationsHibernate));
        }
        return allStations;
    }

}
