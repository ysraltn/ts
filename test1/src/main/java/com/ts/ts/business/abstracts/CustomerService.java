package com.ts.ts.business.abstracts;

import com.ts.ts.business.requests.CreateCostumerRequest;
import com.ts.ts.business.responses.GetAllCustomersResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomersResponse> getAll();

    void addCustomer(CreateCostumerRequest createCostumerRequest);
}
