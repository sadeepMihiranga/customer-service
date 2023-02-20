package lk.hatchyard.customerservice.controller;

import lk.hatchyard.customerservice.entity.Customer;
import lk.hatchyard.customerservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        log.info("saveCustomer method invoked");
        return  customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable("id") Long customerId) {
        log.info("findCustomerById method invoked");
        return customerService.getCustomerById(customerId);
    }

}
