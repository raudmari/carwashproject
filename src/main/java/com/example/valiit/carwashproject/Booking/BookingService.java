package com.example.valiit.carwashproject.Booking;


import com.example.valiit.carwashproject.exceptions.ApplicationException;
import liquibase.pro.packaged.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private WashStationRepository washStationRepository;
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    public void booking(Booking info) {
        Booking booking = new Booking();
        booking.setDateTime(info.getDateTime());
        booking.setWashStationId(info.getWashStationId());
        booking.setServiceTypeId(info.getServiceTypeId());
        booking.setCustomerId(info.getCustomerId());
        LocalDateTime dbTateTime = bookingRepository.getOne(info.getId()).getDateTime();
        if (info.getDateTime() == dbTateTime) {
            throw new ApplicationException("See aeg on broneeritud!");
        }
        bookingRepository.save(booking);
    }


}
