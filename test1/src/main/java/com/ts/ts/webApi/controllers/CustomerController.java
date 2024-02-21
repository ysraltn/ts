package com.ts.ts.webApi.controllers;

import com.ts.ts.business.abstracts.CustomerService;
import com.ts.ts.business.requests.CreateCostumerRequest;
import com.ts.ts.business.responses.GetAllCustomersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public List<GetAllCustomersResponse> getAll(){
        return customerService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addCustomer(@RequestBody() CreateCostumerRequest createCostumerRequest){
        this.customerService.addCustomer(createCostumerRequest);
    }

    @PutMapping("/update")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void updateCustomer(@RequestBody() CreateCostumerRequest createCostumerRequest, int id){
        this.customerService.addCustomer(createCostumerRequest);
    }
}
