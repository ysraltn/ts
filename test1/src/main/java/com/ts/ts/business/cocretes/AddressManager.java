package com.ts.ts.business.cocretes;

import com.ts.ts.business.abstracts.AddressService;
import com.ts.ts.business.requests.CreateAddressRequest;
import com.ts.ts.business.responses.GetAddressResponse;
import com.ts.ts.business.responses.GetAllAddressesResponse;
import com.ts.ts.core.utilities.mappers.ModelMapperService;
import com.ts.ts.dataAccess.abstracts.AddressRepository;
import com.ts.ts.entities.concretes.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressManager implements AddressService {

    private AddressRepository addressRepository;
    private ModelMapperService modelMapperService;

    @Autowired
    public AddressManager(AddressRepository addressRepository, ModelMapperService modelMapperService) {
        this.addressRepository = addressRepository;
        this.modelMapperService = modelMapperService;

    }

    @Override
    public List<GetAllAddressesResponse> getAll() {
        List<Address> addresses = addressRepository.findAll();
        List<GetAllAddressesResponse> addressesResponse = addresses.stream()
                .map(address->this.modelMapperService.forResponse()
                        .map(address, GetAllAddressesResponse.class))
                .collect(Collectors.toList());
        return addressesResponse;
    }

    @Override
    public List<GetAddressResponse> getAddressByCustomerId() {
        return null;
    }

    @Override
    public void addAddress(CreateAddressRequest createAddressRequest) {
        Address address = this.modelMapperService.forRequest().map(createAddressRequest, Address.class);
        addressRepository.save(address);
    }


}
