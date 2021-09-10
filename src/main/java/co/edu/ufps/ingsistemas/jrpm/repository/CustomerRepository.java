package co.edu.ufps.ingsistemas.jrpm.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ufps.ingsistemas.jrpm.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Void save(Optional<Customer> customerToUpdate);

}
