package com.ts.ts.webApi.controllers;

import com.ts.ts.business.abstracts.AddressService;
import com.ts.ts.business.requests.CreateAddressRequest;
import com.ts.ts.business.responses.GetAllAddressesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin("*")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {

        this.addressService = addressService;
    }

    @GetMapping("/getall")
    public List<GetAllAddressesResponse> getAll(){

        return addressService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addAddress(@RequestBody CreateAddressRequest createAddressRequest){

        addressService.addAddress(createAddressRequest);
    }
}
