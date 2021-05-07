package com.example.valiit.carwashproject.servicetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceTypeService {

    @Autowired HibernateServiceTypeRepository hibernateServiceTypeRepository;

    public List<AllServices> getAllServices() {
        List<ServiceTypeHibernate> servicesAll = hibernateServiceTypeRepository.findAllBy();
        List<AllServices> allServices = new ArrayList<>();
        for(ServiceTypeHibernate serviceTypeHibernate : servicesAll) {
            allServices.add(new AllServices(serviceTypeHibernate));
        }
        return allServices;
    }
}
