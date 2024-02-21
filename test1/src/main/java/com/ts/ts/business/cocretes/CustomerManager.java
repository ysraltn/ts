package com.ts.ts.business.cocretes;

import com.ts.ts.business.abstracts.CustomerService;
import com.ts.ts.business.requests.CreateCostumerRequest;
import com.ts.ts.business.responses.GetAllCustomersResponse;
import com.ts.ts.core.utilities.mappers.ModelMapperService;
import com.ts.ts.dataAccess.abstracts.CustomerRepository;
import com.ts.ts.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository, ModelMapperService modelMapperService) {
        this.customerRepository = customerRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public List<GetAllCustomersResponse> getAll() {
        List<Customer> customers = customerRepository.findAll();
        List<GetAllCustomersResponse> customersResponse = customers.stream()
                .map(customer->this.modelMapperService.forResponse()
                        .map(customer, GetAllCustomersResponse.class))
                .collect(Collectors.toList());
        return customersResponse;
    }

    @Override
    public void addCustomer(CreateCostumerRequest createCostumerRequest) {
        Customer customer = this.modelMapperService.forRequest().map(createCostumerRequest, Customer.class);
        this.customerRepository.save(customer);
        //Customer customer = new Customer();
        //customer.setCustomerNo(createCostumerRequest.getCustomerNo());
        //customer.setTitle(createCostumerRequest.getTitle());
        //this.customerRepository.save(customer);
    }
}
