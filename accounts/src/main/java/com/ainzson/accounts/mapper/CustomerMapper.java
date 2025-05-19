package com.ainzson.accounts.mapper;

import com.ainzson.accounts.dto.CustomerDto;
import com.ainzson.accounts.entities.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(com.ainzson.accounts.entities.Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
