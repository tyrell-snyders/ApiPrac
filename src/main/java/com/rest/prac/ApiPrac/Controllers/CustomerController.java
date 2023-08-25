package com.rest.prac.ApiPrac.Controllers;

import java.util.List;

import com.rest.prac.ApiPrac.Entity.Customer;
import com.rest.prac.ApiPrac.Repositories.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers") //Creates a default route
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping() //Uses the default endpoint: "api/v1/customers"
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }
}
