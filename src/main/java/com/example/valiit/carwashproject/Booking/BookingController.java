package com.example.valiit.carwashproject.Booking;

import com.example.valiit.carwashproject.DTO.UserHistory;
import com.example.valiit.carwashproject.exceptions.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin
    @PostMapping("api/public/carwash/booking")
    public Integer booking(@RequestBody Booking id, Principal principal) {
        bookingService.timeTaken(id);
        String email = null;
        if(principal != null){
            principal.getName();
        }
        return bookingService.booking(id, email);
    }

    @CrossOrigin
    @GetMapping("api/public/carwash/washStation")
    public List<WashStationInfoResponse> getWashStationInfo() {
        return bookingService.getWashStationInfo();
    }

    @CrossOrigin
    @GetMapping("api/public/carwash/serviceType")
    public List<ServiceTypeInfoResponse> getServiceTypeInfo() {
        return bookingService.getServiceTypeInfo();
    }

    @GetMapping("api/public/carwash/account")
    public List<UserHistory> getUserHistory(Principal principal){
        return bookingService.getUserHistory(principal.getName());
    }
}
