package com.example.valiit.carwashproject.Booking;


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
    @Autowired
    private HibernateUserHistoryRepository userHistoryRepository;

    public Integer booking(Booking info, String email) {
        LoginHibernate user = loginRepository.findByEmail(email);
        Booking booking = new Booking();
        booking.setDateTime(info.getDateTime());
        booking.setWashStationId(info.getWashStationId());
        booking.setServiceTypeId(info.getServiceTypeId());
        booking.setCustomerId(user.getId());
        booking.setPin(info.getPin());
        bookingRepository.save(booking);
        return info.getPin();
    }

    public String timeTaken(Booking time) {
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
        Integer customerId = loginRepository.findByEmail(email).getId();
        List<UserHistoryHibernate> userHistoryHibernateList = userHistoryRepository.getAllByCustomerId(customerId);
        List<UserHistory> userHistories = new ArrayList<>();
        for (UserHistoryHibernate userHistoryHibernate : userHistoryHibernateList) {
            userHistories.add(new UserHistory(userHistoryHibernate));
        }
        return userHistories;
    }

}
