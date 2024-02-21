package com.ts.ts.business.abstracts;

import com.ts.ts.business.requests.CreateServiceRequest;
import com.ts.ts.business.responses.GetAllServicesRespond;

import java.util.List;

public interface ServiceService {
    public void add(CreateServiceRequest createServiceRequest);
    public List<GetAllServicesRespond> geAll();
}
