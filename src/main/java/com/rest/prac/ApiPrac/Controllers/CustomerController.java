package com.rest.prac.ApiPrac.Controllers;

import java.util.List;

import com.rest.prac.ApiPrac.Entity.Customer;
import com.rest.prac.ApiPrac.Repositories.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        //Read and return the customers from the DB
        return customerRepository.findAll();
    }

    record NewCustomerRequest(String name, String email, Integer age) {}

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request) { //Receives JSON object from data
        Customer customer = new Customer();

        customer.setName(request.name);
        customer.setEmail(request.email);
        customer.setAge(request.age);

        customerRepository.save(customer); //Inserts into the customer table
    }
}
