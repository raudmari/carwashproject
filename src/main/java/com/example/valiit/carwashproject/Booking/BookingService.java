package com.example.valiit.carwashproject.Booking;


import com.example.valiit.carwashproject.DTO.AllServices;
import com.example.valiit.carwashproject.DTO.AllStations;
import com.example.valiit.carwashproject.DTO.BookingRequest;
import com.example.valiit.carwashproject.DTO.UserHistory;

import com.example.valiit.carwashproject.exceptions.ApplicationException;
import com.example.valiit.carwashproject.login.HibernateLoginRepository;
import com.example.valiit.carwashproject.login.LoginHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private HibernateLoginRepository loginRepository;

    public Integer booking(BookingRequest info, String email) {
        Integer userId = null;
        if(userId != null) {
            LoginHibernate user = loginRepository.findByEmail(email);
            userId = user.getId();
        }
        Booking booking = new Booking();
        booking.setDateTime(info.getDateTime());
        WashStation washStation = new WashStation();
        washStation.setId(info.getWashStationId());
        booking.setWashStation(washStation);
        ServiceType serviceType = new ServiceType();
        serviceType.setId(info.getServiceTypeId());
        booking.setServiceType(serviceType);
        booking.setCustomerId(userId);
        booking.setPin(info.getPin());
        bookingRepository.save(booking);
        return info.getPin();
    }

    public String timeTaken(BookingRequest time) {
        Optional<Booking> bookingOptional = bookingRepository.findByDateTimeAndWashStationId(time.getDateTime(), time.getWashStationId());
        if (bookingOptional.isPresent()) {
            throw new ApplicationException("See aeg on broneeritud");
        }
        return "";
    }

    public List<WashStationInfoResponse> getWashStationInfo() {
        List<WashStationInfoResponse> resultList = new ArrayList<>();
        List<WashStation> washStations = washStationRepository.findAllBy();
        for (WashStation washStation : washStations) {
            resultList.add(new WashStationInfoResponse(washStation));
        }
        return resultList;
    }

    public List<ServiceTypeInfoResponse> getServiceTypeInfo() {
        List<ServiceTypeInfoResponse> resultList = new ArrayList<>();
        List<ServiceType> serviceTypes = serviceTypeRepository.findAllBy();
        for (ServiceType serviceType : serviceTypes) {
            resultList.add(new ServiceTypeInfoResponse(serviceType));
        }
        return resultList;
    }

    public List<UserHistory> getUserHistory(String email) {
        Integer userId = null;
        if(userId != null) {
            LoginHibernate user = loginRepository.findByEmail(email);
            userId = user.getId();
        }
        List<Booking> bookingList = bookingRepository.getAllByCustomerId(userId);
        List<UserHistory> userHistories = new ArrayList<>();
        for (Booking booking : bookingList) {
            userHistories.add(new UserHistory(booking));
        }
        return userHistories;
    }

    public List<AllServices> getService() {
        List<AllServices> allServices = new ArrayList<>();
        List<ServiceType> serviceTypes = serviceTypeRepository.findAllBy();
        for (ServiceType serviceType :serviceTypes) {
            allServices.add(new AllServices(serviceType));
        }
        return allServices;
    }

    public List<AllStations> getStations() {
        List<AllStations> allStations = new ArrayList<>();
        List<WashStation> washStations = washStationRepository.findAllBy();
        for (WashStation washStation : washStations) {
            allStations.add(new AllStations(washStation));
        }
        return allStations;
    }

}
