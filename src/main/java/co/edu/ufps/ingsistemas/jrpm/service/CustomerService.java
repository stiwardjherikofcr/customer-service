package co.edu.ufps.ingsistemas.jrpm.service;

import java.util.List;
import java.util.Optional;
import co.edu.ufps.ingsistemas.jrpm.entities.Customer;

public interface CustomerService {
    public List<Customer> findAllCustomers();

    public Optional<Customer> findCustomerById(Long id);

    public Customer saveCustomer(Customer customerNew);

    public String deleteCustomer(Long id);

    public String updateCustomer(Customer customerNew);
}

