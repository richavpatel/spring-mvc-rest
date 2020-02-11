package richa.springFramework.springmvcrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import richa.springFramework.springmvcrest.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
