package com.tataelxsi.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tataelxsi.restapi.model.CustomerDetailsModel;
import com.tataelxsi.restapi.repository.CustomerDetailsRepository;
import com.tataelxsi.restapi.service.CustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
    
    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;
    

	@Override
    public CustomerDetailsModel getCustomerDetails(String customerId) {
        return(customerDetailsRepository.findById(customerId).get());
    }

    @Override
    public List<CustomerDetailsModel> getAllCustomers() {
        return customerDetailsRepository.findAll();
    }

    @Override
    public String addCustomer(CustomerDetailsModel customer) {
        customerDetailsRepository.save(customer);
        return "Customer Details Added";
    }

    @Override
    public String updateCustomer(String customerId, CustomerDetailsModel updatedCustomer) {
        customerDetailsRepository.save(updatedCustomer);
        return "Update Success";
    }

    @Override
    public String deleteCustomer(String customerId) {
        customerDetailsRepository.deleteById(customerId);
        return "Delete Success";
    }
}
