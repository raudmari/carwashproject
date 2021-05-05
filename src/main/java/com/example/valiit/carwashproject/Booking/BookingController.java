package com.example.valiit.carwashproject.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin
    @PostMapping("api/public/carwash/booking")
    public String booking(@RequestBody Booking id) {
        bookingService.timeTaken(id);
        bookingService.booking(id);
        return "Aitäh. Teie teenus " + id.getServiceTypeId() + " asukohaga " + id.getWashStationId() + " on kinnitatud " +
                "kuupäeval " + id.getDateTime() + ". Teie kood on " + id.getPin();
    }

    @CrossOrigin
    @GetMapping("api/public/carwash/washStation")
    public List<WashStation> getWashStationInfo() {
        return bookingService.getWashStationInfo();
    }

    @CrossOrigin
    @GetMapping("api/public/carwash/serviceType")
    public List<ServiceType> getServiceTypeInfo() {
        return bookingService.getServiceTypeInfo();
    }
}
