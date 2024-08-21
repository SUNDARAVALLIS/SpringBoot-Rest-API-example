package com.tataelxsi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tataelxsi.restapi.model.CustomerDetailsModel;
import com.tataelxsi.restapi.service.CustomerDetailsService;

@RestController
@RequestMapping("/customers")
public class CustomerDetailsController {

    @Autowired
    private CustomerDetailsService customerService;
    

//    public CustomerDetailsController(CustomerDetailsService customerService) {
//		super();
//		this.customerService = customerService;
//	}


	@GetMapping("/display/{customerId}")
    public CustomerDetailsModel getCustomerFromDatabase(@PathVariable String customerId) {
        return customerService.getCustomerDetails(customerId);
    }

    @GetMapping("/display/all")
    public List<CustomerDetailsModel> getAllCustomersFromDatabase() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/create/new")
    public String addCustomerToDatabase(@RequestBody CustomerDetailsModel customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/update/{customerId}")
    public String updateCustomerById(@PathVariable String customerId, @RequestBody CustomerDetailsModel customer) {
        return customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("/delete/{customerId}")
    public String deleteCustomerById(@PathVariable String customerId) {
        return customerService.deleteCustomer(customerId);
    }
}

