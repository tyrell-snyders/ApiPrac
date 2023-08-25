package com.rest.prac.ApiPrac.Repositories;

import com.rest.prac.ApiPrac.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //Enables the application to perform all kinds of sql queries
}
