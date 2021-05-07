package com.example.valiit.carwashproject.servicetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceTypeController {
    @Autowired
    private ServiceTypeService serviceTypeService;

    //http://localhost:9090/api/public/carWash/serviceType
    @GetMapping("/api/public/carWash/serviceType")
    public List<AllServices> getAllServices() {
        return serviceTypeService.getAllServices();
    }
}
