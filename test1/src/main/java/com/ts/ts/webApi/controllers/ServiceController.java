package com.ts.ts.webApi.controllers;

import com.ts.ts.business.abstracts.ServiceService;
import com.ts.ts.business.requests.CreateServiceRequest;
import com.ts.ts.business.responses.GetAllServicesRespond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin("*")
public class ServiceController {
    private ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addService(@RequestBody CreateServiceRequest createServiceRequest){
        serviceService.add(createServiceRequest);
    }

    @GetMapping("/getall")
    public List<GetAllServicesRespond> getAll(){
        return serviceService.geAll();
    }
}
