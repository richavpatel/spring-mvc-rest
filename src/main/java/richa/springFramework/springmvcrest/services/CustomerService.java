package richa.springFramework.springmvcrest.services;

import richa.springFramework.springmvcrest.model.Customer;

import java.util.List;

public interface CustomerService {


    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
