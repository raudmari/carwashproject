package com.example.valiit.carwashproject.Booking;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        booking.setPin(info.getPin());

        bookingRepository.save(booking);

    }

}
