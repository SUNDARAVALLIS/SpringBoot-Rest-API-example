package com.tataelxsi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tataelxsi.restapi.model.CustomerDetailsModel;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsModel, String>{
	
}


