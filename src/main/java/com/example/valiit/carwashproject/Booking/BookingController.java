package com.example.valiit.carwashproject.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
