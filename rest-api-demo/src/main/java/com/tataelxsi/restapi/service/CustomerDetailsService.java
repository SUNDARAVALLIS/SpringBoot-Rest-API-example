package com.tataelxsi.restapi.service;

import com.tataelxsi.restapi.model.CustomerDetailsModel;

import java.util.List;

public interface CustomerDetailsService {
	CustomerDetailsModel getCustomerDetails(String customerId);
    List<CustomerDetailsModel> getAllCustomers();
    String addCustomer(CustomerDetailsModel customer);
    String updateCustomer(String customerId, CustomerDetailsModel customer);
    String deleteCustomer(String customerId);
}
