package lk.hatchyard.customerservice.service;

import lk.hatchyard.customerservice.entity.Customer;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long customerId);
}
