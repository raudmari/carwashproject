package com.example.valiit.carwashproject.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin
    @PostMapping("api/public/carwash/booking")
    public String booking(@RequestBody Booking id) {
        bookingService.booking(id);
        return "Aitäh. Teie teenus " + id.getServiceTypeId() + " asukohaga " + id.getWashStationId() + " on kinnitatud " +
                "kuupäeval " + id.getDateTime() + ". Teie kood on " + id.getPin();
    }
}
