package com.ts.ts.business.cocretes;

import com.ts.ts.business.abstracts.ServiceService;
import com.ts.ts.business.requests.CreateServiceRequest;
import com.ts.ts.business.responses.GetAllServicesRespond;
import com.ts.ts.core.utilities.mappers.ModelMapperService;
import com.ts.ts.dataAccess.abstracts.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceManager implements ServiceService {

    private ServiceRepository serviceRepository;
    private ModelMapperService modelMapperService;

    @Autowired
    public ServiceManager(ServiceRepository serviceRepository, ModelMapperService modelMapperService) {
        this.serviceRepository = serviceRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public void add(CreateServiceRequest createServiceRequest) {
        com.ts.ts.entities.concretes.Service service = this.modelMapperService.forRequest().map(createServiceRequest, com.ts.ts.entities.concretes.Service.class);
        serviceRepository.save(service);
    }

    @Override
    public List<GetAllServicesRespond> geAll() {
        List<com.ts.ts.entities.concretes.Service> services = serviceRepository.findAll();
        List<GetAllServicesRespond> servicesRespond = services.stream().map(service->this.modelMapperService.forResponse()
                        .map(service, GetAllServicesRespond.class))
                .collect(Collectors.toList());
        return servicesRespond;
    }
}
