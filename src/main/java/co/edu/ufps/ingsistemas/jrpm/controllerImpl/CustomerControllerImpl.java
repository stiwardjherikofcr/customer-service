package co.edu.ufps.ingsistemas.jrpm.controllerImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.edu.ufps.ingsistemas.jrpm.controller.CustomerController;
import co.edu.ufps.ingsistemas.jrpm.entities.Customer;
import co.edu.ufps.ingsistemas.jrpm.service.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    CustomerService customerService;

    // http://localhost:8888/customers (GET)
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Customer> getCustomers() {
        return customerService.findAllCustomers();
    }

    // http://localhost:8888/customers/1 (GET)
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    // http://localhost:8888/customers/add (ADD)
    @RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
    @Override
    public Customer addCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // http://localhost:8888/customers/delete/1 (GET)
    @RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

    // http://localhost:8888/customers/update (PATCH)
    @RequestMapping(value = "/customers/update", method = RequestMethod.PATCH, produces = "application/json")
    @Override
    public String updateCustomer(Customer customerNew) {
        return customerService.updateCustomer(customerNew);
    }

    // http://localhost:8888/test (GET)
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String test() {
        return "Test done";
    }
}
