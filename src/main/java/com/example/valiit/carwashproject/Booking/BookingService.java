package com.example.valiit.carwashproject.Booking;


import com.example.valiit.carwashproject.exceptions.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    public String timeTaken(Booking time) {
        Optional<Booking> bookingOptional = bookingRepository.findByDateTimeAndWashStationId(time.getDateTime(), time.getWashStationId());
        if(bookingOptional.isPresent()){
            throw new ApplicationException("See aeg on broneeritud");
        }
        return "";
    }

    public List<WashStation> getWashStationInfo() {
        return washStationRepository.findAllBy();
    }

    public List<ServiceType> getServiceTypeInfo() {
        return serviceTypeRepository.findAllBy();
    }
}
