package com.ts.ts.business.abstracts;

import com.ts.ts.business.requests.CreateAddressRequest;
import com.ts.ts.business.responses.GetAddressResponse;
import com.ts.ts.business.responses.GetAllAddressesResponse;

import java.util.List;

public interface AddressService {
    public void addAddress(CreateAddressRequest createAddressRequest);

    List<GetAllAddressesResponse> getAll();
    List<GetAddressResponse> getAddressByCustomerId();
}
